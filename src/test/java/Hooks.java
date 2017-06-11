import org.junit.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * Created by Sudhakar on 10/06/2017.
 */
public class Hooks {

    BaseMain base = new BaseMain();
    @Before
    public  void setUp() throws IOException {
        base.openBrowser();
    }
    @After
    public  void tearDown()
    {
        base.closeBrowser();
    }
}