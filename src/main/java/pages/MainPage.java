package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends Page {

    @FindBy(xpath = "//div[@class='bHeaderSearchBar']")
    WebElement searchField;


    public void findInSearch(String searchText) {
        waitForVisible(searchField);
        Init.getBuilder().click(searchField).build().perform();
        Init.getBuilder().sendKeys(searchText).build().perform();
        Init.getBuilder().sendKeys(Keys.ENTER).build().perform();
    }

}
