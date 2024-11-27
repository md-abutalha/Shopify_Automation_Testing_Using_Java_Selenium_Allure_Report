package pages;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class TillHomePage extends BasePage{

    public  By createStore = By.xpath("//button[@id='CreateStoreCta']");
    public By onlineStore = By.xpath("//label[@for=':r1:']//span[@class='gui-QPoaK']");
    public By nextButton = By.xpath("//div[@class='gui-XUTl2 gui-9JIhy']//div//span[contains(text(),'Next')]");

    public By iAmJustStaring = By.xpath("//label[@for=':r7:']//span[@class='gui-b1fK0']");
    public By secondNext = By.xpath("//div[@class='gui-XUTl2 gui-9JIhy']//div//span[contains(text(),'Next')]");
    public By makeSelf = By.xpath("//label[@for=':r9:']//span[@class='gui-QPoaK']");
    public By getStarted = By.xpath("//span[normalize-space()='Get started']");
    public By skip = By.xpath("//span[@class='Polaris-Text--root Polaris-Text--bodySm Polaris-Text--medium']");


}
