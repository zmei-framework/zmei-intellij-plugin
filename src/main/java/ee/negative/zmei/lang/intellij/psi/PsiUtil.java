package ee.negative.zmei.lang.intellij.psi;

import com.intellij.psi.PsiElement;
import org.antlr.jetbrains.adaptor.psi.Trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PsiUtil {

    public static List<PsiNode> toPsiNodeList(Collection<PsiElement> elements) {
        List<PsiNode> nodes = new ArrayList<PsiNode>();
        for (PsiElement el: elements) {
            nodes.add((PsiNode) el);
        }
        return nodes;
    }

    public static List<PsiNode> getAllRuleNodes(PsiElement root, int ruleIdx) {
        return toPsiNodeList(Trees.findAllRuleNodes(root, ruleIdx));
    }

    public static List<PsiNode> getAllTokenNodes(PsiElement root, int tokenIdx) {
        return toPsiNodeList(Trees.findAllTokenNodes(root, tokenIdx));
    }

    public static PsiNode getTokenNode(PsiElement root, int tokenIdx) {
        List<PsiNode> els = getAllTokenNodes(root, tokenIdx);
        if (els.size() == 0) {
            return null;
        }
        return els.get(0);
    }

    public static PsiNode getRuleNode(PsiElement root, int ruleIdx) {
        List<PsiNode> els = getAllRuleNodes(root, ruleIdx);
        if (els.size() == 0) {
            return null;
        }
        return els.get(0);
    }
}
