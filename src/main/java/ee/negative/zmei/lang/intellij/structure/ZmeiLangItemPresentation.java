package ee.negative.zmei.lang.intellij.structure;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import ee.negative.zmei.lang.intellij.Icons;
import ee.negative.zmei.lang.intellij.psi.PageElementNode;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZmeiLangItemPresentation implements ItemPresentation {

    protected final PsiElement element;

    protected ZmeiLangItemPresentation(PsiElement element) {
        this.element = element;
    }

    @Nullable
    @Override
    public Icon getIcon(boolean unused) {
        return Icons.FUNC_ICON;
    }

    @Nullable
    @Override
    public String getPresentableText() {
        ASTNode node = element.getNode();
        return node.getText();
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;

    }
}
