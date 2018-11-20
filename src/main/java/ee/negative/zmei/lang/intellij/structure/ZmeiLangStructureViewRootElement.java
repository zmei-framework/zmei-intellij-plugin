package ee.negative.zmei.lang.intellij.structure;

import com.intellij.ide.structureView.StructureViewTreeElement;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class ZmeiLangStructureViewRootElement extends ZmeiLangStructureViewElement {

    public ZmeiLangStructureViewRootElement(PsiElement element) {
        super(element);
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new ZmeiLangRootPresentation((PsiFile)element);
    }
}
