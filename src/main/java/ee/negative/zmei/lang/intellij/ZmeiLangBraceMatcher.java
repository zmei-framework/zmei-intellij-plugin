package ee.negative.zmei.lang.intellij;

import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter;
import com.intellij.lang.BracePair;
import com.intellij.lang.Language;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import ee.negative.zmei.lang.intellij.parser.ZmeiLangSimpleLexer;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ZmeiLangBraceMatcher extends PairedBraceMatcherAdapter {

    public ZmeiLangBraceMatcher(@NotNull PairedBraceMatcher matcher, @NotNull Language language) {
        super(new ZmeiLangPairedBraceMatcher(), ZmeiLanguage.INSTANCE);
    }

    private static class ZmeiLangPairedBraceMatcher implements PairedBraceMatcher {

        @NotNull
        @Override
        public BracePair[] getPairs() {

            List<TokenIElementType> tokenIElementTypes =
                    PSIElementTypeFactory.getTokenIElementTypes(ZmeiLanguage.INSTANCE);

            TokenIElementType leftBrace = tokenIElementTypes.get(ZmeiLangSimpleLexer.BRACE_OPEN);


            return new BracePair[]{

                    new BracePair(
                            leftBrace,
                            tokenIElementTypes.get(ZmeiLangSimpleLexer.BRACE_CLOSE),
                            false
                    ),

                    new BracePair(
                            tokenIElementTypes.get(ZmeiLangSimpleLexer.SQ_BRACE_OPEN),
                            tokenIElementTypes.get(ZmeiLangSimpleLexer.SQ_BRACE_CLOSE),
                            false
                    ),
//                    new BracePair(MarkdownTokenTypes.LBRACKET, MarkdownTokenTypes.RBRACKET, false),
//                    new BracePair(MarkdownTokenTypes.LT, MarkdownTokenTypes.GT, false),
//                    new BracePair(MarkdownTokenTypes.CODE_FENCE_START, MarkdownTokenTypes.CODE_FENCE_END, true)
            };
        }

        @Override
        public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, IElementType contextType) {
            return true;
        }

        @Override
        public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
            return openingBraceOffset;
        }
    }
}
