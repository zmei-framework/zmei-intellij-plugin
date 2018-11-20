package ee.negative.zmei.lang.intellij;

import com.intellij.lang.Language;
import com.intellij.lang.javascript.dialects.JSXHarmonyLanguageDialect;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.InjectedLanguagePlaces;
import com.intellij.psi.LanguageInjector;
import com.intellij.psi.PsiLanguageInjectionHost;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import ee.negative.zmei.lang.intellij.psi.PageElementNode;
import ee.negative.zmei.lang.intellij.psi.PageFieldCodeNode;
import ee.negative.zmei.lang.intellij.psi.PsiNode;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PageElementInjector implements LanguageInjector {

    private static final Logger log = Logger.getInstance("ZmeiLang");

    @Override
    public void getLanguagesToInject(@NotNull PsiLanguageInjectionHost host, @NotNull InjectedLanguagePlaces injectionPlacesRegistrar) {

        if (!(host instanceof PageElementNode)) return;
        PageElementNode element = (PageElementNode) host;
        final String text = element.getText();

        StringBuilder pagePrefix = new StringBuilder();
        pagePrefix.append("import React from 'react';\n\n");

        collectVars(pagePrefix, (PsiNode) element.getParent());

        pagePrefix.append("var pageEl = ");

        injectionPlacesRegistrar.addPlace(
                Objects.requireNonNull(Language.findLanguageByID("JSX Harmony")),
                new TextRange(0, text.length()),
                pagePrefix.toString(), ";"
        );
    }

    private void collectVars(StringBuilder pagePrefix, PsiNode page) {

        PsiNode pageUrl = page.getRuleNode(ZmeiLangParser.RULE_page_url);

        if (pageUrl != null) {
            Pattern p = Pattern.compile("<\\s*([\\w_]+)\\s*>");   // the pattern to search for
            Matcher matcher = p.matcher(pageUrl.getText());

            List<String> urlParams = new ArrayList<String>();
            urlParams.add("const url = {\n");

            int matchesCount = 0;

            // if we find a match, get the group
            while (matcher.find()) {
                urlParams.add(String.format("    %s: \"\"\n", matcher.group(1)));
                matchesCount++;
            }
            if (matchesCount > 0) {
                pagePrefix.append(String.join(",", urlParams));
                pagePrefix.append("\n};\n");
            }
        }

        for (PsiNode pageField : page.getAllRuleNodes(ZmeiLangParser.RULE_page_field)) {

            PsiNode pageFieldKey = pageField.getRuleNode(ZmeiLangParser.RULE_page_field_name);
            try {
                String key = pageFieldKey.getText();

                pagePrefix.append(String.format("const %s = {};\n", key));

            } catch (NullPointerException e) {}
        }
    }
}
