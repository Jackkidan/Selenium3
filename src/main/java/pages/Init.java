package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Init {

    static WebDriver driver;
    private static Actions builder;

    public static WebDriver getDriver() {
        return driver;
    }

    public static Actions getBuilder() {
        return builder;
    }

    public static void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        builder = new Actions(driver);

    }

    public static void tearDown() {
        driver.close();
    }
}
