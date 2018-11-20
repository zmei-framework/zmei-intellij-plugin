package ee.negative.zmei.lang.intellij;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Kostiantyn Shchepanovskyi
 */
public class ZmeiLangFileTypeTest {

    private ZmeiLangFileType fileType;

    @Before
    public void setUp() throws Exception {
        fileType = new ZmeiLangFileType();
    }

    @Test
    public void name() throws Exception {
        Assert.assertEquals("sample", fileType.getDefaultExtension());
    }

}