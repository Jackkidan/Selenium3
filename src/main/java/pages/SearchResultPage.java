package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchResultPage extends Page {

    private static final By viewCart = By.cssSelector(".mCart .eMyOzon_ItemWrap");

    private static final By buyButtonElement1 = By.cssSelector(".item-view:nth-of-type(8) .tile-buy-button");
    private static final By priceElement1 = By.cssSelector(".item-wrapper .item-view:nth-of-type(8) .total-price .price-number");
    private static final By buyButtonElement2 = By.cssSelector(".item-view:nth-of-type(7) .tile-buy-button");
    private static final By priceElement2 = By.cssSelector(".item-wrapper .item-view:nth-of-type(7) .total-price .price-number");
    private static final By buyButtonElement3 = By.cssSelector(".item-view:nth-of-type(6) .tile-buy-button");
    private static final By priceElement3 = By.cssSelector(".item-wrapper .item-view:nth-of-type(6) .total-price .price-number");
    private static final By buyButtonElement4 = By.cssSelector(".item-view:nth-of-type(5) .tile-buy-button");
    private static final By priceElement4 = By.cssSelector(".item-wrapper .item-view:nth-of-type(5) .total-price .price-number");
    private static final By buyButtonElement5 = By.cssSelector(".item-view:nth-of-type(4) .tile-buy-button");
    private static final By priceElement5 = By.cssSelector(".item-wrapper .item-view:nth-of-type(4) .total-price .price-number");

    private static int totalSumm = 0;

    public void findElementsInPage() {
        // 1 товар
        waitForVisible(priceElement1);
        waitForVisible(buyButtonElement1);
        WebElement price1 = findByCss(priceElement1);
        scrollToElement(price1);
        totalSumm += Integer.parseInt(price1.getText().replaceAll("[^0-9]", ""));
        WebElement element1 = findByCss(buyButtonElement1);
        scrollToElement(element1);
        element1.click();

        // 2 товар
        waitForVisible(priceElement2);
        waitForVisible(buyButtonElement2);
        WebElement price2 = findByCss(priceElement2);
        scrollToElement(price2);
        totalSumm += Integer.parseInt(price2.getText().replaceAll("\\s", ""));
        WebElement element2 = findByCss(buyButtonElement2);
        scrollToElement(element2);
        element2.click();

        // 3 товар
        waitForVisible(priceElement3);
        waitForVisible(buyButtonElement3);
        WebElement price3 = findByCss(priceElement3);
        scrollToElement(price3);
        totalSumm += Integer.parseInt(price3.getText().replaceAll("\\s", ""));
        WebElement element3 = findByCss(buyButtonElement3);
        scrollToElement(element3);
        element3.click();

        // 4 товар
        waitForVisible(priceElement4);
        waitForVisible(buyButtonElement4);
        WebElement price4 = findByCss(priceElement4);
        scrollToElement(price4);
        totalSumm += Integer.parseInt(price4.getText().replaceAll("\\s", ""));
        WebElement element4 = findByCss(buyButtonElement4);
        scrollToElement(element4);
        element4.click();

        // 5 товар
        waitForVisible(priceElement5);
        waitForVisible(buyButtonElement5);
        WebElement price5 = findByCss(priceElement5);
        scrollToElement(price5);
        totalSumm += Integer.parseInt(price5.getText().replaceAll("\\s", ""));
        WebElement element5 = findByCss(buyButtonElement5);
        scrollToElement(element5);
        element5.click();

    }

    public void clickViewCart() {
        waitForVisible(viewCart);
        WebElement cart = findByCss(viewCart);
        cart.click();
    }

    public static int getTotalSumm() {
        return totalSumm;
    }
}
