import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainTest
{
    public static WebDriver driver;
    public static FindPage findPage;
    public static CalcPage calcPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mishka\\chromedriver.exe");
        driver = new ChromeDriver();
        findPage = new FindPage(driver);
        calcPage = new CalcPage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://google.com");
    }

    @Test
    @Step("First step")
    public void testing() {
        findPage.input("Калькулятор");
        findPage.clickBtn();
        calcPage.inputNumbers();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        calcPage.inputNumberTask2();
        calcPage.inputNumberTask3();
    }

    @AfterClass
    public static void down() { driver.quit(); }

}
