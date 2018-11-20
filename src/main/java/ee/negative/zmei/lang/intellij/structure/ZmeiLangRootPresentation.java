package ee.negative.zmei.lang.intellij.structure;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import ee.negative.zmei.lang.intellij.Icons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;


public class ZmeiLangRootPresentation implements ItemPresentation {
    protected final PsiFile element;

    protected ZmeiLangRootPresentation(PsiFile element) {
        this.element = element;
    }

    @Nullable
    @Override
    public Icon getIcon(boolean unused) {
        return Icons.ZMEI_LANG_ICON;
    }

    @Nullable
    @Override
    public String getPresentableText() {
        return element.getVirtualFile().getNameWithoutExtension();
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;
    }
}
