package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends Page{

    private static final By buyButtonElements = By.cssSelector(".item-view:nth-of-type(8) .tile-buy-button");


    public void findElementsInPage () {
        waitForVisible(buyButtonElements);
        WebElement element = findByCss(buyButtonElements);
        scrollToElement(element);
        //element.click();
    }
}
