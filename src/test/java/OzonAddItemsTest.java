import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.Init;
import pages.MainPage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;

public class OzonAddItemsTest {

    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Before
    public void setUp() {
        Init.setUp();
    }

    @After
    public void tearDown() { Init.tearDown(); }

    @Test
    public void checkCorrectAddToCart() {
        mainPage.findInSearch("iPhone 7 Plus/8 Plus Black");
        searchResultPage.findElementsInPage();
        searchResultPage.clickViewCart();
        shoppingCartPage.checkTotalPrice();
        shoppingCartPage.checkTotatQuantity(5);
    }
}
