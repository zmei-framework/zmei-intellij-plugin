package ee.negative.zmei.lang.intellij;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class ZmeiLangColorSettingsPage implements ColorSettingsPage {

	// TODO: change descriptors

	private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
		new AttributesDescriptor("Annotation", ZmeiLangSyntaxHighlighter.META),
		new AttributesDescriptor("Keyword", ZmeiLangSyntaxHighlighter.KEYWORD),
		new AttributesDescriptor("Page", ZmeiLangSyntaxHighlighter.PAGE),
		new AttributesDescriptor("String", ZmeiLangSyntaxHighlighter.STRING),
		new AttributesDescriptor("Line comment", ZmeiLangSyntaxHighlighter.LINE_COMMENT),
		new AttributesDescriptor("Block comment", ZmeiLangSyntaxHighlighter.BLOCK_COMMENT),
	};

	@Nullable
	@Override
	public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
		return null;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.ZMEI_LANG_ICON;
	}

	@NotNull
	@Override
	public SyntaxHighlighter getHighlighter() {
		return new ZmeiLangSyntaxHighlighter();
	}

	@NotNull
	@Override
	public String getDemoText() {
		return
			"from .models import Cat\n" +
			"\n" +
			"%%\n" +
			"\n" +
			"[index: /]\n" +
			"boo: Cat.objects.all()" +
			"#room\n" +
			"-----------\n" +
			"=name\n" +
			"\n" +
			"@rest\n" +
			"@admin\n" +
			"\n" +
			"#location\n" +
			"-----------\n" +
			"=name\n" +
			"\n" +
			"@admin {list: name}\n" +
			"@rest {\n" +
			"    fields: *\n" +
			"    inline: hotels(\n" +
			"        fields: *, ^location\n" +
			"        inline: rooms(\n" +
			"            fields: *\n" +
			"        )\n" +
			"    )\n" +
			"}";
	}

	@NotNull
	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		return DESCRIPTORS;
	}

	@NotNull
	@Override
	public ColorDescriptor[] getColorDescriptors() {
		return ColorDescriptor.EMPTY_ARRAY;
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "ZmeiLang";
	}
}
