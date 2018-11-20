package ee.negative.zmei.lang.intellij;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.ProcessingContext;
import ee.negative.zmei.lang.intellij.injector.PsiLanguageInjectionMultilineNode;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import ee.negative.zmei.lang.intellij.psi.*;
import org.antlr.jetbrains.adaptor.lexer.RuleIElementType;
import org.jetbrains.annotations.NotNull;

public class ZmeiLangCompletionContributor extends CompletionContributor {

    private static final Logger log = Logger.getInstance("ZmeiLang");

    public ZmeiLangCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(PsiElement.class)
                        .withLanguage(ZmeiLanguage.INSTANCE),

                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {

                        if (parameters.getPosition().getContext() != null) {
                            IElementType elType = parameters.getPosition().getContext().getParent().getNode().getElementType();

                            if (elType instanceof RuleIElementType) {
                                RuleIElementType ruleElType = (RuleIElementType) elType;

                                switch ( ruleElType.getRuleIndex() ) {

                                    case ZmeiLangParser.RULE_col_field_expr_or_def:
                                    case ZmeiLangParser.RULE_wrong_field_type:
                                        resultSet.addElement(LookupElementBuilder.create("longtext"));
                                        resultSet.addElement(LookupElementBuilder.create("html_media"));
                                        resultSet.addElement(LookupElementBuilder.create("html"));
                                        resultSet.addElement(LookupElementBuilder.create("float"));
                                        resultSet.addElement(LookupElementBuilder.create("decimal"));
                                        resultSet.addElement(LookupElementBuilder.create("date"));
                                        resultSet.addElement(LookupElementBuilder.create("datetime"));
                                        resultSet.addElement(LookupElementBuilder.create("create_time"));
                                        resultSet.addElement(LookupElementBuilder.create("update_time"));
                                        resultSet.addElement(LookupElementBuilder.create("text"));
                                        resultSet.addElement(LookupElementBuilder.create("int"));
                                        resultSet.addElement(LookupElementBuilder.create("slug"));
                                        resultSet.addElement(LookupElementBuilder.create("bool"));
                                        resultSet.addElement(LookupElementBuilder.create("relation"));
                                        resultSet.addElement(LookupElementBuilder.create("image"));
                                        resultSet.addElement(LookupElementBuilder.create("file"));
                                        resultSet.addElement(LookupElementBuilder.create("filer_file"));
                                        resultSet.addElement(LookupElementBuilder.create("filer_folder"));
                                }
                            }
                        }

                    }
                }
        );
    }

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result) {
        super.fillCompletionVariants(parameters, result);
    }
}
