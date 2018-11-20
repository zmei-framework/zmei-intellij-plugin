package ee.negative.zmei.lang.intellij.psi;

import com.intellij.lang.ASTNode;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import org.jetbrains.annotations.NotNull;

public class ModelFieldDefNode extends PsiNode {
    public ModelFieldDefNode(@NotNull ASTNode node) {
        super(node);
    }

}
