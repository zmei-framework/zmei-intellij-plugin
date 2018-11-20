package ee.negative.zmei.lang.intellij.psi;

import com.intellij.lang.ASTNode;
import ee.negative.zmei.lang.intellij.injector.PsiLanguageInjectionNode;
import org.jetbrains.annotations.NotNull;

public class PageFieldCodeNode extends PsiLanguageInjectionNode {
    public PageFieldCodeNode(@NotNull ASTNode node) {
        super(node);
    }
}
