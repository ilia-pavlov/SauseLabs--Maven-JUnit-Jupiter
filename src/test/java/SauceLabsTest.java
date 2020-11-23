import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.AssertErrorMessages;

public class SauceLabsTest {

    WebDriver driver;

    @BeforeSuite
    private void setup() {
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


    @Test
    public void priceAfterAddLimitedMinVirtualCloud() {
        String expectedPrice = "298";
        clickPricingPage();
        clickCheckBox();
        String actualPrice = verifyPrice();

        Assert.assertEquals(actualPrice, expectedPrice, AssertErrorMessages.AMOUNT_OF_PRICE);

    }
    private String verifyPrice() {
        String xpath = "//span[contains(@class,'price') and text() = '298']";
        WebElement price = driver.findElement(By.xpath(xpath));
        return price.getText();
    }
    private void clickCheckBox() {
        String xpath = "//strong[contains(@class,'price') and text() = '149']";
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(xpath)));
        act.click().build().perform();

    }
    private void clickPricingPage() {
        WebElement link = driver.findElement(By.linkText("Pricing"));
        link.click();
    }




   /* @Test
    public void verifyContentAfterChoseDifferentOptionsInDropdown() { //Virtual Could
        clickDropdown();
        switchTo4ParallelTests();
        verifyNewContent();
        switchTo8ParallelTests();
        verifyNewContent();
        switchTo16ParallelTests();
        verifyNewContent();
        switchTo24ParallelTests();
        verifyNewContent();
    }

    @Test
    public void tryFreeVersion() {
        clickTryItFreeButton();
        typeFristName();
        tupeLasttName();
        typetWorkEmail();
        typeCompanyName();
        clickButtonNext();
        typeUserName();
        typePassword();
        selectCountry();
        selectPreferedDataCenter();
        clickImNotRobot();
        clickGetStarted();
    } */
}


