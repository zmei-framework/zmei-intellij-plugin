package ee.negative.zmei.lang.intellij.structure;

import com.intellij.navigation.ItemPresentation;
import ee.negative.zmei.lang.intellij.Icons;
import ee.negative.zmei.lang.intellij.psi.ModelElementNode;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZmeiLangModelPresentation implements ItemPresentation {

    protected final ModelElementNode element;

    protected ZmeiLangModelPresentation(ModelElementNode element) {
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
        return element.getName();
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;

    }
}
