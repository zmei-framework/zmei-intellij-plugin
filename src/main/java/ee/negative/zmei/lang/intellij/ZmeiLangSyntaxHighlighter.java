package ee.negative.zmei.lang.intellij;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangSimpleLexer;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/** A highlighter is really just a mapping from token type to
 *  some text attributes using {@link #getTokenHighlights(IElementType)}.
 *  The reason that it returns an array, TextAttributesKey[], is
 *  that you might want to mix the attributes of a few known highlighters.
 *  A {@link TextAttributesKey} is just a name for that a theme
 *  or IDE skin can set. For example, {@link com.intellij.openapi.editor.DefaultLanguageHighlighterColors#KEYWORD}
 *  is the key that maps to what identifiers look like in the editor.
 *  To change it, see dialog: Editor > Colors & Fonts > Language Defaults.
 *
 *  From <a href="http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support/syntax_highlighting_and_error_highlighting.html">doc</a>:
 *  "The mapping of the TextAttributesKey to specific attributes used
 *  in an editor is defined by the EditorColorsScheme class, and can
 *  be configured by the user if the plugin provides an appropriate
 *  configuration interface.
 *  ...
 *  The syntax highlighter returns the {@link TextAttributesKey}
 * instances for each token type which needs special highlighting.
 * For highlighting lexer errors, the standard TextAttributesKey
 * for bad characters HighlighterColors.BAD_CHARACTER can be used."
 */
public class ZmeiLangSyntaxHighlighter extends SyntaxHighlighterBase {
	private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
	public static final TextAttributesKey META =
		createTextAttributesKey("META", DefaultLanguageHighlighterColors.NUMBER);
	public static final TextAttributesKey PAGE =
		createTextAttributesKey("ZMEI_PAGE", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
	public static final TextAttributesKey KEYWORD =
		createTextAttributesKey("ZMEI_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey SIGN =
		createTextAttributesKey("ZMEI_SIGN", DefaultLanguageHighlighterColors.NUMBER);
	public static final TextAttributesKey STRING =
		createTextAttributesKey("ZMEI_STRING", DefaultLanguageHighlighterColors.STRING);
	public static final TextAttributesKey LINE_COMMENT =
		createTextAttributesKey("ZMEI_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey BLOCK_COMMENT =
		createTextAttributesKey("ZMEI_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);


	public static final TextAttributesKey BAD_CHARACTER =
			createTextAttributesKey("ZMEI_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

	static {
		PSIElementTypeFactory.defineLanguageIElementTypes(ZmeiLanguage.INSTANCE,
		                                                  ZmeiLangParser.tokenNames,
		                                                  ZmeiLangParser.ruleNames);
	}

	@NotNull
	@Override
	public Lexer getHighlightingLexer() {
		ZmeiLangSimpleLexer lexer = new ZmeiLangSimpleLexer(null);
		return new ANTLRLexerAdaptor(ZmeiLanguage.INSTANCE, lexer);
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
		if ( !(tokenType instanceof TokenIElementType) ) return EMPTY_KEYS;
		TokenIElementType myType = (TokenIElementType)tokenType;
		int ttype = myType.getANTLRTokenType();
		TextAttributesKey attrKey;
		switch ( ttype ) {

			case ZmeiLangSimpleLexer.AN_MENU:
			case ZmeiLangSimpleLexer.AN_CRUD:
			case ZmeiLangSimpleLexer.AN_CRUD_DETAIL:
			case ZmeiLangSimpleLexer.AN_CRUD_DELETE:
			case ZmeiLangSimpleLexer.AN_CRUD_EDIT:
			case ZmeiLangSimpleLexer.AN_CRUD_CREATE:
			case ZmeiLangSimpleLexer.AN_CELERY:
			case ZmeiLangSimpleLexer.AN_POST:
			case ZmeiLangSimpleLexer.AN_ERROR:
			case ZmeiLangSimpleLexer.AN_AUTH:
			case ZmeiLangSimpleLexer.AN_MARKDOWN:
			case ZmeiLangSimpleLexer.AN_REACT:
			case ZmeiLangSimpleLexer.AN_HTML:
			case ZmeiLangSimpleLexer.AN_TREE:
			case ZmeiLangSimpleLexer.AN_DATE_TREE:
			case ZmeiLangSimpleLexer.AN_MIXIN:
			case ZmeiLangSimpleLexer.AN_M2M_CHANGED:
			case ZmeiLangSimpleLexer.AN_POST_DELETE:
			case ZmeiLangSimpleLexer.AN_PRE_DELETE:
			case ZmeiLangSimpleLexer.AN_POST_SAVE:
			case ZmeiLangSimpleLexer.AN_PRE_SAVE:
			case ZmeiLangSimpleLexer.AN_CLEAN:
			case ZmeiLangSimpleLexer.AN_API:
			case ZmeiLangSimpleLexer.AN_REST:
			case ZmeiLangSimpleLexer.AN_ORDER:
			case ZmeiLangSimpleLexer.AN_SORTABLE:
			case ZmeiLangSimpleLexer.AN_LANGS:
			case ZmeiLangSimpleLexer.AN_FILER:
			case ZmeiLangSimpleLexer.AN_ADMIN:
			case ZmeiLangSimpleLexer.AN_SUIT:
				attrKey = META;
				break;
//			case ZmeiLangSimpleLexer.LT:
//			case ZmeiLangSimpleLexer.GT:
//			case ZmeiLangSimpleLexer.EXCLUDE:
//			case ZmeiLangSimpleLexer.BRACE_OPEN:
//			case ZmeiLangSimpleLexer.BRACE_CLOSE:
//			case ZmeiLangSimpleLexer.SQ_BRACE_OPEN:
//			case ZmeiLangSimpleLexer.SQ_BRACE_CLOSE:
//			case ZmeiLangSimpleLexer.QUESTION_MARK:
//			case ZmeiLangSimpleLexer.UNDERSCORE:
//			case ZmeiLangSimpleLexer.DASH:
//			case ZmeiLangSimpleLexer.HASH:
//			case ZmeiLangSimpleLexer.SLASH:
//			case ZmeiLangSimpleLexer.EQUALS:
//			case ZmeiLangSimpleLexer.DOLLAR:
//			case ZmeiLangSimpleLexer.AMP:
//			case ZmeiLangSimpleLexer.EXCLAM:
//			case ZmeiLangSimpleLexer.STAR:
//			case ZmeiLangSimpleLexer.APPROX:
//			case ZmeiLangSimpleLexer.PIPE:
//				attrKey = SIGN;
//				break;
			case ZmeiLangSimpleLexer.STRING_DQ:
			case ZmeiLangSimpleLexer.STRING_SQ:
				attrKey = STRING;
				break;
			case ZmeiLangSimpleLexer.COMMENT_LINE:
				attrKey = LINE_COMMENT;
				break;
			case ZmeiLangSimpleLexer.COMMENT_BLOCK :
				attrKey = BLOCK_COMMENT;
				break;
			default :
				return EMPTY_KEYS;
		}
		return new TextAttributesKey[] {attrKey};
	}
}
