package ee.negative.zmei.lang.intellij;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.diagnostic.Logger;
public class ZmeiLangSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    private static final Logger log = Logger.getInstance("ZmeiLang");

    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
        log.info("Highlighter created!");
        return new ZmeiLangSyntaxHighlighter();
    }
}
