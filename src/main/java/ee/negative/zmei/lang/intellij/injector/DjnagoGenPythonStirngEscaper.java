package ee.negative.zmei.lang.intellij.injector;

import com.intellij.openapi.util.ProperTextRange;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.LiteralTextEscaper;
import com.intellij.psi.PsiLanguageInjectionHost;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DjnagoGenPythonStirngEscaper extends LiteralTextEscaper<PsiLanguageInjectionHost> {

    private Boolean multiline;

    public DjnagoGenPythonStirngEscaper(PsiLanguageInjectionHost element) {
        super(element);
        multiline = false;
    }

    public DjnagoGenPythonStirngEscaper(PsiLanguageInjectionHost element, Boolean acceptMultiline) {
        super(element);
        multiline = acceptMultiline;
    }

    @Override
    public boolean decode(@NotNull TextRange rangeInsideHost, @NotNull StringBuilder outChars) {
        ProperTextRange.assertProperRange(rangeInsideHost);
        outChars.append(myHost.getText(), rangeInsideHost.getStartOffset(), rangeInsideHost.getEndOffset());

        return true;
    }

    private String replaceModelNames(String text) {

        Pattern rxFindCollectionRefs = Pattern.compile("#(\\w+)\\.");

        StringBuffer sb = null;
        Matcher m = rxFindCollectionRefs.matcher(text);

        while (m.find()) {
            String colName = m.group(1);

            if (sb == null) {
                sb = new StringBuffer(text.length());
            }
            String varName = "_" + colName;
            m.appendReplacement(sb, varName + '.');
        }

        if (sb != null) {
            m.appendTail(sb);
        }

        if (sb != null) {
            return sb.toString();
        } else {
            return text;
        }
    }

    @Override
    public int getOffsetInHost(int offsetInDecoded, @NotNull TextRange rangeInsideHost) {
        ProperTextRange.assertProperRange(rangeInsideHost);
        int offset = offsetInDecoded;

        offset += rangeInsideHost.getStartOffset();
        if (offset < rangeInsideHost.getStartOffset()) offset = rangeInsideHost.getStartOffset();
        int endOffset = rangeInsideHost.getEndOffset();
        if (offset > endOffset) offset = endOffset;
        return offset;
    }

    @Override
    public boolean isOneLine() {
        return !multiline;
    }
}
