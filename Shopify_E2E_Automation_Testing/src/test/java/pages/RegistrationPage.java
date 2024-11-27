package pages;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;

public class RegistrationPage extends BasePage{
    public String shopifyUrl = "https://www.shopify.com/?msclkid=b9d596d522211f802fcdf193a02987d8";
    public By login = By.xpath("//ul[@class='lg:flex hidden items-center']//li[@class='mr-8 text-base']");
    public By getStarted = By.xpath("//a[normalize-space()='Get started']");
    public By signUpWithMail = By.xpath("//body/div/div[contains(@class,'page-container')]/div[@class='page-main']/div[@class='page-content with-shadow']/div[@class='main-content']/div[@class='login-card login-card--content-heavy']/div[@class='login-card__content']/div[@class='main-card-section']/div[@class='signup']/a[1]/div[1]");

    public By emailField = By.xpath("//input[@id='account_email']");
    public By firstNameField = By.xpath("//input[@id='account_first_name']");
    public By lastNameField = By.xpath("//input[@id='account_last_name']");
    public By passwordField = By.xpath("//input[@id='account_password']");
    public By confromPasswordField = By.xpath("//input[@id='password-confirmation']");

    public By regSubmit = By.xpath("//span[@class='content']");
}
