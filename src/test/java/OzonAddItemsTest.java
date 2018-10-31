import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.*;

public class OzonAddItemsTest {


    @Before
    public void setUp() {
        Init.setUp();
    }

    @After
    public void tearDown() {
        Init.tearDown();
    }

    @Test
    public void checkCorrectAddToCart() {
        MainPage mainPage = new MainPage();
        SearchResultPage searchResultPage = new SearchResultPage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


        mainPage.findInSearch("iPhone 7 Plus/8 Plus Black");
        searchResultPage.getElementList();
        searchResultPage.addSeveralItems(5); // Можно указать, сколько товаров добавить в корзину
        searchResultPage.clickViewCart();
        shoppingCartPage.checkTotatQuantity(5);
        shoppingCartPage.checkTotalPrice();

    }
}
