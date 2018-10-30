package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Page {
    private static final By totalPrice = By.xpath("//div[@class = 'eCartTotal_summPrice ']");
    private static final By totalQuantity = By.xpath("//div[@class = 'eCartTotal_infoCount']");

    public void checkTotalPrice() {
        waitForVisible(totalPrice);
        WebElement price = findByXpath(totalPrice);
        int totalP = Integer.parseInt(price.getText().replaceAll("[^0-9]", ""));
        checkTotalValue(totalP, SearchResultPage.getTotalSumm());

    }

    public void checkTotatQuantity(int q) {
        waitForVisible(totalQuantity);
        WebElement quantity = findByXpath(totalQuantity);
        int totalQ = Integer.parseInt(quantity.getText().replaceAll("[^0-9]", ""));
        checkTotalValue(totalQ, q);

    }

}
