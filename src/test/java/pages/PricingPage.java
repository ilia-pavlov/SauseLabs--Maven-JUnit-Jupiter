package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PricingPage {
    private final WebDriver driver;

    public PricingPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnCheckBox() throws InterruptedException {    //wait by certain element should be separate methode in BaseTest class (Web9(33:14))
        String xpath = "//strong[contains(@class,'price')and text() = '149']";
        WebElement checkbox = driver.findElement(By.xpath(xpath));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(3000);
        checkbox.click();

    }

    public int verifyPrice() {
        String xpath = "//span[contains(@class,'price') and text() = '298']";
        WebElement price = driver.findElement(By.xpath(xpath));
        String analyze = price.getText();
        return Integer.parseInt(analyze);

    }
}
