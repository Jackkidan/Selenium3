package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

public class SearchResultPage extends Page {

    private static final By elementsView = By.xpath("//div[@class = 'item-view']");
    private static final By addElementButton = By.xpath(".//button[@class = 'buy-button blue-cream enlarged button flat-button tile-buy-button' ]");
    private static final By elementPrice = By.xpath(".//span[@class = 'price-number']");

    @FindBy(css = ".mCart .eMyOzon_ItemWrap")
    WebElement viewCart;


    private List<WebElement> elementList;
    private static int totalSumm = 0;

    public void getElementList() {
        waitForVisible(elementsView);
        elementList = Init.getDriver().findElements(elementsView);
    }

    public void addItem(int element) {
        waitForVisible(elementPrice);
        waitForVisible(addElementButton);
        scrollToElement(elementList.get(element).findElement(elementPrice));
        totalSumm += Integer.parseInt(elementList.get(element).findElement(elementPrice)
                .getText().replaceAll("[^0-9]", ""));
        scrollToElement(elementList.get(element).findElement(addElementButton));
        elementList.get(element).findElement(addElementButton).click();
    }

    public void addSeveralItems(int quantity) {
        if (quantity < elementList.size() && quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                addItem(i);
            }
        } else {
            throw new NoSuchElementException("Некорректно указано количество товаров для добавления в корзину");

        }
    }

    public void clickViewCart() {
        waitForVisible(viewCart);
        viewCart.click();
    }

    public static int getTotalSumm() {
        return totalSumm;
    }
}
