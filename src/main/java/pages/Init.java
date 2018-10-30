package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Init {

    static WebDriver driver;
    private static Actions builder;
    static String BASE_URL = "https://www.ozon.ru/";

    public static WebDriver getDriver() {
        return driver;
    }

    public static Actions getBuilder() {
        return builder;
    }

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        builder = new Actions(driver);
    }

    public static void tearDown() {
        driver.close();
    }
}
