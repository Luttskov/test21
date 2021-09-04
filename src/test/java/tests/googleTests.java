package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Button;
import pages.Result;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {

    private static WebDriver driver;
    private static SearchPage searchPage;
    private static Button button;
    private static Result result;


    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        button = new Button(driver);
        result = new Result(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeEach
    public void setup() {
        driver.get("http://google.com");
        searchPage.search("Калькулятор");
    }

    @Test
    public void test1() {
        button.lftpar.click();
        button.one.click();
        button.plus.click();
        button.two.click();
        button.rgtpar.click();
        button.multi.click();
        button.three.click();
        button.minus.click();
        button.four.click();
        button.zero.click();
        button.split.click();
        button.five.click();
        button.equ.click();
        assertAll(
                () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", result.getMem()),
                () -> assertEquals("1", result.getResult())
        );
    }

    @Test
    public void test2() {
        button.six.click();
        button.split.click();
        button.zero.click();
        button.equ.click();
        assertAll(
                () -> assertEquals("6 ÷ 0 =", result.getMem()),
                () -> assertEquals("Infinity", result.getResult())
        );
    }



    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
