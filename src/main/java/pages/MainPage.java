package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends Page{
    private static final By searchField = By.xpath("//div[@class='bHeaderSearchBar']");

    public void findInSearch (String searchText) {
        waitForVisible(searchField);
        WebElement element = findByCss(searchField);
        builder.click(element).build().perform();
        builder.sendKeys(searchText).build().perform();
        builder.sendKeys(Keys.ENTER).build().perform();
    }

}
