import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;
import pages.SearchResultPage;

public class OzonAddItemsTest {
    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @Before
    public void setUp() {
        mainPage.setUp();
    }

    @After
    public void tearDown() {
       // mainPage.tearDown();
    }

    @Test
    public void checkCorrectAddToCart() {
        mainPage.findInSearch("iPhone 7 Plus/8 Plus Black");
        searchResultPage.findElementsInPage();
    }
}
