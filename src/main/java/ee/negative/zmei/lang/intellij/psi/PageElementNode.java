package ee.negative.zmei.lang.intellij.psi;

import com.intellij.lang.ASTNode;
import ee.negative.zmei.lang.intellij.injector.PsiLanguageInjectionNode;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import org.jetbrains.annotations.NotNull;

public class PageElementNode extends PsiLanguageInjectionNode {
    public PageElementNode(@NotNull ASTNode node) {
        super(node);
    }

    public String getName() {
        try {
            return getRuleNode(ZmeiLangParser.RULE_page_name).getText();

        } catch (NullPointerException e) {
            return "Untitled page";
        }
    }
}
