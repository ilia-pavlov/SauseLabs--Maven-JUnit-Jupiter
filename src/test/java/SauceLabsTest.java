import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLabsTest {

    WebDriver driver;

    @BeforeSuite
    private void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/macOS/chrome/chromedriver87");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucelabs.com/");

    }

    @AfterSuite
    private void afterSuit() {
        driver.quit();
    }



    @Test
    public void verifyPriceAfterAddLimitedMinutes() { //Virtual Could
        clickPricingPage();
        clickCheckBox();
        //verifyPrice();
    }

    private void clickCheckBox() {
        String xpath = "//*[@name = 'virtual-platform-cloud-unlimited']";
        WebElement checkbox = driver.findElement(By.xpath(xpath));
        checkbox.click();   //element click intercepted
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


