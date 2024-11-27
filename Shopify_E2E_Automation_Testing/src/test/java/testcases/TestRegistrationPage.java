package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import utilities.DriverSetup;

import java.time.Duration;

public class TestRegistrationPage extends DriverSetup {
    RegistrationPage registrationPage = new RegistrationPage();


    @Test(priority = 1, description = "Reg With valid credentials")
    public void testRegistrationWithValidCredentials() throws InterruptedException {
        getDriver().get(registrationPage.shopifyUrl);
        Thread.sleep(3000);
        registrationPage.clickElement(registrationPage.login);
        Thread.sleep(3000);
        registrationPage.clickElement(registrationPage.getStarted);
        registrationPage.clickElement(registrationPage.signUpWithMail);
        Thread.sleep(3000);

        registrationPage.writeOnElement(registrationPage.emailField,"noyob29228@nausard.com");
        registrationPage.writeOnElement(registrationPage.firstNameField,"Mohammad");
        registrationPage.writeOnElement(registrationPage.lastNameField,"Talha");

        registrationPage.writeOnElement(registrationPage.passwordField,"noyob29228@nausard.com");
        registrationPage.writeOnElement(registrationPage.confromPasswordField,"nataxeh876@merotx.com");
        Thread.sleep(4000);
        registrationPage.clickElement(registrationPage.regSubmit);
    }



}
