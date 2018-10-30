package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {


    protected WebElement findByXpath(By xpath) {
        return Init.getDriver().findElement(xpath);
    }

    protected WebElement findByCss(By css) {
        return Init.getDriver().findElement(css);
    }


    void checkTotalValue(int total, int expectedValue) {
        Assert.assertEquals("Значения не соотвествует ожидаемому",
                expectedValue, total);
    }

    void waitForVisible(By path) {
        WebDriverWait wait = new WebDriverWait(Init.getDriver(), 10);
        wait.pollingEvery(Duration.ofMillis(300))
                .until(ExpectedConditions.visibilityOfElementLocated(path));
    }


    void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Init.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
