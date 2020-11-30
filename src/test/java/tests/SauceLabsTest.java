package tests;

import  ErrorMassages.AssertErrorMessages;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PricingPage;


public class SauceLabsTest extends BaseTest {

    @Test //positive test
    public void priceAfterAddLimitedMinutesVirtualCloud() throws InterruptedException {
        int expectedPrice = 298;

        MainPage mainPage = new MainPage(driver);
        mainPage.clickPricingPage();

        PricingPage pricingPage = new PricingPage(driver);
        pricingPage.clickOnCheckBox();
        int actualPrice = pricingPage.verifyPrice();

        Assert.assertEquals(actualPrice, expectedPrice, AssertErrorMessages.AMOUNT_OF_PRICE);
    }

    @Test //negative test
    public void priceAfterAddLimitedMinutesVirtualCloudNegative() throws InterruptedException {
        int expectedPrice = 297;

        MainPage mainPage = new MainPage(driver);
        mainPage.clickPricingPage();

        PricingPage pricingPage = new PricingPage(driver);
        pricingPage.clickOnCheckBox();
        int actualPrice = pricingPage.verifyPrice();

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



