package ee.negative.zmei.lang.intellij.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.antlr.jetbrains.adaptor.psi.Trees;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PsiNode extends ANTLRPsiNode {

    public PsiNode(@NotNull ASTNode node) {
        super(node);
    }

    public Collection<? extends PsiNode> getAllRuleNodes(int ruleIdx) {
        return PsiUtil.getAllRuleNodes(this, ruleIdx);
    }

    public Collection<? extends PsiNode> getAllTokenNodes(int tokenIdx) {
        return PsiUtil.getAllTokenNodes(this, tokenIdx);
    }

    public PsiNode getTokenNode(int tokenIdx) {
        return PsiUtil.getTokenNode(this, tokenIdx);
    }

    public PsiNode getRuleNode(int ruleIdx) {
        return PsiUtil.getRuleNode(this, ruleIdx);
    }
}
