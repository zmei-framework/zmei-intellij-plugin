package ee.negative.zmei.lang.intellij;

import com.intellij.lang.Language;

public class ZmeiLanguage extends Language {
    public static final ZmeiLanguage INSTANCE = new ZmeiLanguage();

    private ZmeiLanguage() {
        super("ZmeiLang");
    }
}
