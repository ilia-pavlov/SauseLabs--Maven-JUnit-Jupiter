package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    public WebDriver driver;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/macOS/chrome/chromedriver87");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/");
    }
    @BeforeTest
    private void acceptCookie() {
        String xpath = "//a[@aria-label='dismiss cookie message']";
        By elementToWait = By.xpath(xpath);
        ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOfElementLocated(elementToWait);
        new WebDriverWait(driver, 10).until(condition);

        WebElement cookieOK = driver.findElement(By.xpath(xpath));
        cookieOK.click();
    }
    @AfterSuite
    private void afterSuit() {
        driver.quit();
    }
}
