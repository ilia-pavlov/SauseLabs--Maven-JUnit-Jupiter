package tests;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import pages.MainPage;
import pages.PricingPage;


public class SauceLabsTest extends BaseTest {

    @Test //positive test
    @DisplayName("Price after selected unlimited minutes to Virtual Cloud ")
    public void priceAfterAddLimitedMinutesVirtualCloud() throws InterruptedException {
        int expectedPrice = 298;

        MainPage mainPage = new MainPage(driver);
        mainPage.clickPricingPage();

        PricingPage pricingPage = new PricingPage(driver);
        pricingPage.clickOnCheckBox();
        int actualPrice = pricingPage.verifyPrice();

        Assert.assertEquals(expectedPrice, actualPrice);
    }

    @Test //negative test
    @DisplayName("Negative wrong expectation variables")
    public void priceAfterAddLimitedMinutesVirtualCloudNegative01() throws InterruptedException {
        int expectedPrice = 297;

        MainPage mainPage = new MainPage(driver);
        mainPage.clickPricingPage();

        PricingPage pricingPage = new PricingPage(driver);
        pricingPage.clickOnCheckBox();
        int actualPrice = pricingPage.verifyPrice();

        Assert.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    @Disabled("Not implemented yet")
    public void priceAfterAddLimitedMinutesVirtualCloudNegative02() throws InterruptedException {
        int expectedPrice = 100;

        MainPage mainPage = new MainPage(driver);
        mainPage.clickPricingPage();

        PricingPage pricingPage = new PricingPage(driver);
        pricingPage.clickOnCheckBox();
        int actualPrice = pricingPage.verifyPrice();

        Assert.assertEquals(expectedPrice, actualPrice);
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



