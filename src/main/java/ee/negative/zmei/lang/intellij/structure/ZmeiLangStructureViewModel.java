package ee.negative.zmei.lang.intellij.structure;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import ee.negative.zmei.lang.intellij.psi.ZmeiLangPSIFileRoot;
import org.jetbrains.annotations.NotNull;

public class ZmeiLangStructureViewModel
        extends StructureViewModelBase
        implements StructureViewModel.ElementInfoProvider {

    public ZmeiLangStructureViewModel(@NotNull ZmeiLangPSIFileRoot psiFile) {
        super(psiFile, new ZmeiLangStructureViewRootElement(psiFile));
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[] {Sorter.ALPHA_SORTER};
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return !isAlwaysShowsPlus(element);
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        Object value = element.getValue();
        return value instanceof ZmeiLangPSIFileRoot;
    }
}
