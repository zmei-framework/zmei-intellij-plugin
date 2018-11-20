package ee.negative.zmei.lang.intellij;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import ee.negative.zmei.lang.intellij.injector.PsiLanguageInjectionMultilineNode;
import ee.negative.zmei.lang.intellij.psi.*;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangSimpleLexer;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.RuleIElementType;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.antlr.jetbrains.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangParser;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ZmeiLangParserDefinition implements ParserDefinition {
	public static final IFileElementType FILE =
		new IFileElementType(ZmeiLanguage.INSTANCE);

//	public static TokenIElementType ID;

	static {
		PSIElementTypeFactory.defineLanguageIElementTypes(ZmeiLanguage.INSTANCE,
		                                                  ZmeiLangParser.tokenNames,
		                                                  ZmeiLangParser.ruleNames);
		List<TokenIElementType> tokenIElementTypes =
			PSIElementTypeFactory.getTokenIElementTypes(ZmeiLanguage.INSTANCE);

//		ID = tokenIElementTypes.get(ZmeiLangSimpleLexer.ID);
	}

	public static final TokenSet COMMENTS =
		PSIElementTypeFactory.createTokenSet(
			ZmeiLanguage.INSTANCE,
			ZmeiLangSimpleLexer.COMMENT_LINE,
			ZmeiLangSimpleLexer.COMMENT_BLOCK
		);

	public static final TokenSet WHITESPACE =
		PSIElementTypeFactory.createTokenSet(
			ZmeiLanguage.INSTANCE,
			ZmeiLangSimpleLexer.WS
//			ZmeiLangSimpleLexer.NL
		);

	public static final TokenSet STRING =
		PSIElementTypeFactory.createTokenSet(
			ZmeiLanguage.INSTANCE
//			ZmeiLangSimpleLexer.COL_STR_EXPR,
//			ZmeiLangSimpleLexer.ANNOT_BLOCK,
//			ZmeiLangSimpleLexer.COL_VNAME,
//			ZmeiLangSimpleLexer.COL_FIELD_VNAME,
//			ZmeiLangSimpleLexer.COL_FIELD_HELP
		);

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		ZmeiLangSimpleLexer lexer = new ZmeiLangSimpleLexer(null);
		return new ANTLRLexerAdaptor(ZmeiLanguage.INSTANCE, lexer);
	}

	@NotNull
	public PsiParser createParser(final Project project) {
		final ZmeiLangParser parser = new ZmeiLangParser(null);
		return new ANTLRParserAdaptor(ZmeiLanguage.INSTANCE, parser) {
			@Override
			protected ParseTree parse(Parser parser, IElementType root) {
				return ((ZmeiLangParser) parser).col_file();
			}
		};
	}

	/** "Tokens of those types are automatically skipped by PsiBuilder." */
	@NotNull
	public TokenSet getWhitespaceTokens() {
		return WHITESPACE;
	}

	@NotNull
	public TokenSet getCommentTokens() {
		return COMMENTS;
	}

	@NotNull
	public TokenSet getStringLiteralElements() {
		return STRING;
	}

	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
		return SpaceRequirements.MAY;
	}

	/** What is the IFileElementType of the root parse tree node? It
	 *  is called from {@link #createFile(FileViewProvider)} at least.
	 */
	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	/** Create the root of your PSI tree (a PsiFile).
	 *
	 *  From IntelliJ IDEA Architectural Overview:
	 *  "A PSI (Program Structure Interface) file is the root of a structure
	 *  representing the contents of a file as a hierarchy of elements
	 *  in a particular programming language."
	 *
	 *  PsiFile is to be distinguished from a FileASTNode, which is a parse
	 *  tree node that eventually becomes a PsiFile. From PsiFile, we can get
	 *  it back via: {@link PsiFile#getNode}.
	 */
	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new ZmeiLangPSIFileRoot(viewProvider);
	}

	/** Convert from *NON-LEAF* parse node (AST they call it)
	 *  to PSI node. Leaves are created in the AST factory.
	 *  Rename re-factoring can cause this to be
	 *  called on a TokenIElementType since we want to rename ID nodes.
	 *  In that case, this method is called to create the root node
	 *  but with ID type. Kind of strange, but we can simply create a
	 *  ASTWrapperPsiElement to make everything work correctly.
	 *
	 *  RuleIElementType.  Ah! It's that ID is the root
	 *  IElementType requested to parse, which means that the root
	 *  node returned from parsetree->PSI conversion.  But, it
	 *  must be a CompositeElement! The adaptor calls
	 *  rootMarker.done(root) to finish off the PSI conversion.
	 *  See {@link ANTLRParserAdaptor#parse(IElementType root,
	 *  PsiBuilder)}
	 *
	 *  If you don't care to distinguish PSI nodes by type, it is
	 *  sufficient to create a {@link ANTLRPsiNode} around
	 *  the parse tree node
	 */
	@NotNull
	public PsiElement createElement(ASTNode node) {

		IElementType elType = node.getElementType();

		if (elType instanceof RuleIElementType) {
			RuleIElementType ruleElType = (RuleIElementType) elType;

			switch ( ruleElType.getRuleIndex() ) {

				case ZmeiLangParser.RULE_col_file:
					return new RootNode(node);

				case ZmeiLangParser.RULE_col_field_expr_or_def:
					return new ModelFieldDefNode(node);

				case ZmeiLangParser.RULE_page_imports :
					return new PsiLanguageInjectionMultilineNode(node);

				case ZmeiLangParser.RULE_model_imports :
					return new PsiLanguageInjectionMultilineNode(node);

				case ZmeiLangParser.RULE_code_block :
					return new PsiLanguageInjectionMultilineNode(node);

				case ZmeiLangParser.RULE_col_field :
					return new ModelElementNode(node);

				case ZmeiLangParser.RULE_page_field_code :
					return new PageFieldCodeNode(node);

				default :
					return new PsiNode(node);
			}

		} else if (elType instanceof TokenIElementType) {
			TokenIElementType tokenElType = (TokenIElementType) elType;

			switch ( tokenElType.getANTLRTokenType() ) {

//				case ZmeiLangSimpleLexer.:
//					return new CurlyBraceOpenNode(node);
//
//				case ZmeiLangSimpleLexer.ANNOT_BLOCK_END:
//					return new CurlyBraceCloseNode(node);

				default :
					return new PsiNode(node);
			}
		}

		return new PsiNode(node);

	}
}
