package ee.negative.zmei.lang.intellij.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import ee.negative.zmei.lang.intellij.Icons;
import ee.negative.zmei.lang.intellij.ZmeiLangFileType;
import ee.negative.zmei.lang.intellij.ZmeiLanguage;
import org.antlr.jetbrains.adaptor.SymtabUtils;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZmeiLangPSIFileRoot extends PsiFileBase {
    public ZmeiLangPSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ZmeiLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return ZmeiLangFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "ZmeiLang file";
    }

    @Override
    public Icon getIcon(int flags) {
        return Icons.ZMEI_LANG_ICON;
    }

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@Override
	public ScopeNode getContext() {
		return null;
	}

}
