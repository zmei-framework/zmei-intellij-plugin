package ee.negative.zmei.lang.intellij.injector;

import com.intellij.lang.injection.MultiHostInjector;
import com.intellij.lang.injection.MultiHostRegistrar;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.jetbrains.python.PythonLanguage;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangSimpleLexer;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import ee.negative.zmei.lang.intellij.psi.PageFieldCodeNode;
import ee.negative.zmei.lang.intellij.psi.PsiNode;
import ee.negative.zmei.lang.intellij.psi.RootNode;
import org.apache.commons.lang.WordUtils;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PythonLanguageMultihostInjector implements MultiHostInjector {

    private static final Logger log = Logger.getInstance("DjangoGen");

    private boolean started = false;
    private int placesInScope = 0;

    private void scopeStart(@NotNull MultiHostRegistrar registrar) {
        ProgressManager.checkCanceled();
        if (started) return;

        registrar.startInjecting(PythonLanguage.INSTANCE);
        started = true;
    }

    private void scopeEnd(@NotNull MultiHostRegistrar registrar) {
        ProgressManager.checkCanceled();
        if (!started) return;

        started = false;

        if (placesInScope > 0) {
            registrar.doneInjecting();
            placesInScope = 0;
        }
    }

    private void addPlace(@NotNull MultiHostRegistrar registrar, @NonNls @Nullable String prefix, @NonNls @Nullable String suffix, @NotNull PsiLanguageInjectionHost host, @NotNull TextRange rangeInsideHost) {
        scopeStart(registrar);

        registrar.addPlace(prefix, suffix, host, rangeInsideHost);

        placesInScope++;
    }

    @Override
    public void getLanguagesToInject(@NotNull MultiHostRegistrar registrar, @NotNull PsiElement context) {
        final StringBuilder prefix = new StringBuilder("\nfrom django.http.request import HttpRequest\n" +
                "request = HttpRequest()\n" +
                "\n" +
                "class DjangoModel(object):\n" +
                "\n" +
                "    def delete(self, *args, **kwargs):\n" +
                "        return None\n" +
                "\n" +
                "    def filter(self, *args, **kwargs):\n" +
                "        return []\n" +
                "\n" +
                "    def all(self, *args, **kwargs):\n" +
                "        return []\n" +
                "\n" +
                "    def __getattribute__(self, name: str) -> Any:\n" +
                "        return super().__getattribute__(name)\n" +
                "def cached(extra=None):\n" +
                "    pass\n" +
                "\n" +
                "def or_404(boo):\n" +
                "    pass\n");

        RootNode root = (RootNode) context;

        ProgressManager.checkCanceled();

        for (PsiNode name : root.getAllRuleNodes(ZmeiLangParser.RULE_col_name)) {
            String colName = WordUtils.capitalizeFully(name.getText(), new char[]{'_'}).replaceAll("_", "");

            prefix.append("class ");
            prefix.append(colName);
            prefix.append("(object):\n");
            prefix.append("    objects = DjangoModel()\n\n");
            prefix.append("    def __getattribute__(self, name: str) -> Any:\n");
            prefix.append("        return super().__getattribute__(name)\n\n");
        }

        final String suffix = "";

        PsiElement importSection = root.getRuleNode(ZmeiLangParser.RULE_page_imports);


        if (importSection != null) {
            addPlace(
                    registrar,
                    prefix.toString(), suffix,
                    (PsiLanguageInjectionHost) importSection,
                    new TextRange(0, importSection.getTextLength() - 2)
            );
        }

        ProgressManager.checkCanceled();

        for (PsiNode page : root.getAllRuleNodes(ZmeiLangParser.RULE_page)) {
            String pagePrefix = prefix + "";

            PsiNode pageUrl = page.getRuleNode(ZmeiLangParser.RULE_page_url);

            if (pageUrl != null) {
                Pattern p = Pattern.compile("<\\s*([\\w_]+)\\s*>");   // the pattern to search for
                Matcher matcher = p.matcher(pageUrl.getText());

                List<String> urlParams = new ArrayList<String>();
                urlParams.add("class url(object):\n");

                int matchesCount = 0;

                // if we find a match, get the group
                while (matcher.find()) {
                    urlParams.add(String.format("    %s = \"\"\n", matcher.group(1)));
                    matchesCount++;
                }
                if (matchesCount > 0) {
                    pagePrefix = String.join("", urlParams);
                }
            }

            for (PsiNode pageField : page.getAllRuleNodes(ZmeiLangParser.RULE_page_field)) {

                PsiNode pageFieldKey = pageField.getRuleNode(ZmeiLangParser.RULE_page_field_name);
                PageFieldCodeNode pageFieldValue = (PageFieldCodeNode) pageField.getRuleNode(ZmeiLangParser.RULE_page_field_code);

                try {
                    String text = pageFieldValue.getText();
                    String key = pageFieldKey.getText();

                    StringBuilder varPrefix = new StringBuilder();

                    String prefix_code;

                    if (text.trim().startsWith("#")) {
                        prefix_code = pagePrefix + "\n" + varPrefix.toString() +
                                "" + String.format("%s = DjangoModel ", key);
                    } else {
                        prefix_code = pagePrefix + "\n" + varPrefix.toString() +
                                "" + String.format("%s = ", key);
                    }

                    addPlace(
                            registrar,
                            prefix_code, "\n", pageFieldValue,
                            new TextRange(0, pageFieldValue.getTextLength())
                    );

                } catch (NullPointerException e) {
                }
            }
            scopeEnd(registrar);
        }
        scopeEnd(registrar);

    }

    @NotNull
    @Override
    public List<? extends Class<? extends PsiElement>> elementsToInjectIn() {
        return Arrays.asList(RootNode.class);
    }
}
