package ee.negative.zmei.lang.intellij.structure;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import ee.negative.zmei.lang.intellij.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ZmeiLangStructureViewElement implements StructureViewTreeElement, SortableTreeElement {

    private static final Logger log = Logger.getInstance("DjangoGen");

    protected final PsiElement element;

    public
    ZmeiLangStructureViewElement(PsiElement element) {
        this.element = element;
    }

    @Override
    public Object getValue() {
        return element;
    }

    @Override
    public void navigate(boolean requestFocus) {
        if (element instanceof NavigationItem) {
            ((NavigationItem) element).navigate(requestFocus);
        }
    }

    @Override
    public boolean canNavigate() {
        return element instanceof NavigationItem &&
                ((NavigationItem) element).canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element instanceof NavigationItem &&
                ((NavigationItem) element).canNavigateToSource();
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        String s = element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : null;
        if (s == null) return "unknown key";
        return s;
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        if (element instanceof PageElementNode) {
            return new ZmeiLangPagePresentation((PageElementNode) element);
        }
        if (element instanceof ModelElementNode) {
            return new ZmeiLangModelPresentation((ModelElementNode) element);
        }

        return new ZmeiLangItemPresentation(element);
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        if (element instanceof ZmeiLangPSIFileRoot) {

            Collection<? extends PsiNode> pages = PsiUtil.getAllRuleNodes(element, ZmeiLangParser.RULE_page);
            Collection<? extends PsiNode> models = PsiUtil.getAllRuleNodes(element, ZmeiLangParser.RULE_col);

            List<TreeElement> treeElements = new ArrayList<>(pages.size());
            for (PsiNode el : pages) {
                treeElements.add(new ZmeiLangStructureViewElement(el));
            }
            for (PsiNode el : models) {
                treeElements.add(new ZmeiLangStructureViewElement(el));
            }

            return treeElements.toArray(new TreeElement[pages.size()]);
        }
        return new TreeElement[0];
    }
}
