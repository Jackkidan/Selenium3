package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class MainPage extends Page {
    private static final By searchField = By.xpath("//div[@class='bHeaderSearchBar']");

    public void findInSearch(String searchText) {
        waitForVisible(searchField);
        WebElement element = findByCss(searchField);
        Init.getBuilder().click(element).build().perform();
        Init.getBuilder().sendKeys(searchText).build().perform();
        Init.getBuilder().sendKeys(Keys.ENTER).build().perform();
    }

}
