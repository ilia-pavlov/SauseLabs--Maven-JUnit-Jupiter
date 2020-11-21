import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SauceLabsTest {

    WebDriver driver;

    @BeforeSuite
    private void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/macOS/chrome/chromedriver87" );
        driver = new ChromeDriver();
    }

    @AfterSuite
    private void afterSuit(){
        driver.quit();
    }

    @Test
    public void testTest() {
        openMainPage();
    }

    private void openMainPage() {
        driver.get("https://www.nytimes.com");
    }
}
