package testcases;

import org.testng.annotations.Test;
import pages.RegistrationPage;
import pages.TillHomePage;
import utilities.DriverSetup;

public class TestTillHomePage extends DriverSetup {
    public String url = "https://admin.shopify.com/?ui_locales=en&country=BD";
    RegistrationPage registrationPage = new RegistrationPage();
    TillHomePage tillHomePage = new TillHomePage();

    @Test(priority = 2, description = "till home page all function")
    public void testTillALlTask() throws InterruptedException {
        getDriver().get(url);
        Thread.sleep(9000);
        tillHomePage.clickElement(tillHomePage.createStore);
        Thread.sleep(9000);
        tillHomePage.clickElement(tillHomePage.onlineStore);
        Thread.sleep(9000);
        tillHomePage.clickElement(tillHomePage.nextButton);
        Thread.sleep(9000);
        tillHomePage.clickElement(tillHomePage.iAmJustStaring);
        Thread.sleep(9000);
        tillHomePage.clickElement(tillHomePage.secondNext);
        Thread.sleep(9000);
        tillHomePage.clickElement(tillHomePage.makeSelf);
        Thread.sleep(9000);
        tillHomePage.clickElement(tillHomePage.getStarted);
        Thread.sleep(3000);
        tillHomePage.clickElement(tillHomePage.skip);


    }


}

