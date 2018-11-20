package ee.negative.zmei.lang.intellij;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZmeiLangFileType extends LanguageFileType {
	public static final String FILE_EXTENSION = "col";
		public static final ZmeiLangFileType INSTANCE = new ZmeiLangFileType();

	protected ZmeiLangFileType() {
		super(ZmeiLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "ZmeiGenerator col file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "ZmeiGenerator col file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return FILE_EXTENSION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.ZMEI_LANG_ICON;
	}
}
