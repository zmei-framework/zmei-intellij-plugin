package ee.negative.zmei.lang.intellij.psi;

import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class RootNode extends PsiNode {
    public RootNode(@NotNull ASTNode node) {
        super(node);
    }
}
