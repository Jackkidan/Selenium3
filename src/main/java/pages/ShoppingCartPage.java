package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Page {


    @FindBy(xpath = "//div[@class = 'eCartTotal_summPrice ']")
    WebElement totalPrice;
    @FindBy(xpath = "//div[@class = 'eCartTotal_infoCount']")
    WebElement totalQuantity;

    public void checkTotatQuantity(int q) {
        waitForVisible(totalQuantity);
        int totalQ = Integer.parseInt(totalQuantity.getText().replaceAll("[^0-9]", ""));
        checkTotalValue(totalQ, q);

    }

    public void checkTotalPrice() {
        waitForVisible(totalPrice);
        int totalP = Integer.parseInt(totalPrice.getText().replaceAll("[^0-9]", ""));
        checkTotalValue(totalP, SearchResultPage.getTotalSumm());

    }

}
