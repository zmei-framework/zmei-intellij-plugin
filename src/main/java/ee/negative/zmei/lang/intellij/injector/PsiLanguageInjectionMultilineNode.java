
// This is a generated file. Not intended for manual editing.
package ee.negative.zmei.lang.intellij.injector;

import com.intellij.lang.ASTNode;
import com.intellij.psi.LiteralTextEscaper;
import com.intellij.psi.PsiLanguageInjectionHost;
import org.jetbrains.annotations.NotNull;

public class PsiLanguageInjectionMultilineNode extends PsiLanguageInjectionNode {

    public PsiLanguageInjectionMultilineNode(@NotNull ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public LiteralTextEscaper<? extends PsiLanguageInjectionHost> createLiteralTextEscaper() {
        return new DjnagoGenPythonStirngEscaper(this, true);
    }
}

