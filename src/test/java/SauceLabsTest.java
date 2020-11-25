import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.AssertErrorMessages;
import utilites.Log;

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
        Log.startLog("");

        String xpath = "//a[@aria-label='dismiss cookie message']";
        By elementToWait = By.xpath(xpath);
        ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOfElementLocated(elementToWait);
        new WebDriverWait(driver, 10).until(condition);

        WebElement cookieOK = driver.findElement(By.xpath(xpath));
        cookieOK.click();
    }
    @AfterSuite
    private void afterSuit() {
        Log.startLog("");
        driver.quit();

    }
    @Test //positive test
    public void priceAfterAddLimitedMinutesVirtualCloud() throws InterruptedException {
        int expectedPrice = 298;

        clickPricingPage();
        clickOnCheckBox();
        int actualPrice = verifyPrice();

        Assert.assertEquals(actualPrice, expectedPrice, AssertErrorMessages.AMOUNT_OF_PRICE);

    }
    private int verifyPrice() {
        String xpath = "//span[contains(@class,'price') and text() = '298']";
        WebElement price = driver.findElement(By.xpath(xpath));
        String analyze = price.getText();
        return Integer.parseInt(analyze);

    }
    private void clickOnCheckBox() throws InterruptedException {
        String xpath = "//strong[contains(@class,'price')and text() = '149']";
        WebElement checkbox = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(3000);
        checkbox.click();

    }
    private void clickPricingPage() {
        WebElement link = driver.findElement(By.linkText("Pricing"));
        link.click();
    }
    @Test //negative test
    public void priceAfterAddLimitedMinutesVirtualCloudNegative() throws InterruptedException {
        int expectedPrice = 297;

        clickPricingPage();
        clickOnCheckBox();
        int actualPrice = verifyPrice();

        Assert.assertEquals(actualPrice, expectedPrice, AssertErrorMessages.AMOUNT_OF_PRICE);
    }
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



