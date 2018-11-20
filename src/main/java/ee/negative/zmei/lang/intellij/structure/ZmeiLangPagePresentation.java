package ee.negative.zmei.lang.intellij.structure;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import ee.negative.zmei.lang.intellij.Icons;
import ee.negative.zmei.lang.intellij.psi.PageElementNode;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZmeiLangPagePresentation implements ItemPresentation {

    protected final PageElementNode element;

    protected ZmeiLangPagePresentation(PageElementNode element) {
        this.element = element;
    }

    @Nullable
    @Override
    public Icon getIcon(boolean unused) {
        return Icons.PAGE_ICON;
    }

    @Nullable
    @Override
    public String getPresentableText() {
        return element.getName();
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;

    }
}
