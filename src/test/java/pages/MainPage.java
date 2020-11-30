package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {
    private WebDriver driver; //removed final

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickPricingPage() {
        WebElement link = driver.findElement(By.linkText("Pricing"));
        link.click();

    }
}
