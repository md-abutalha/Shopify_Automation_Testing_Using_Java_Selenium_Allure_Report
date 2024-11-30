package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.RegistrationPage;
import pages.TillHomePage;
import utilities.DriverSetup;

public class TestProductCrud extends DriverSetup {

    ProductPage productPage = new ProductPage();

    RegistrationPage registrationPage = new RegistrationPage();
    TillHomePage tillHomePage = new TillHomePage();

    @Test(priority = 3, description = "Create products")
    public void testCreateProductPage() throws InterruptedException {
        getDriver().get(productPage.url);
        Thread.sleep(6000);
        productPage.clickElement(productPage.addProduct);
        Thread.sleep(5000);
        productPage.writeOnElement(productPage.title, "Yellow Banana Green Banana ");
        Thread.sleep(5000);
        productPage.writeOnElement(productPage.description, "Abu Talha created product fruts: Banana");
        Thread.sleep(5000);
//        WebElement uploadImage = getDriver().flePath);
//        Thread.sleep(5000);indElement(By.cssSelector("button[class='Polaris-Button Polaris-Button--pressable Polaris-Button--variantSecondary Polaris-Button--sizeMicro Polaris-Button--textAlignCenter'] span[class='Polaris-Text--root Polaris-Text--bodySm Polaris-Text--medium']"));
//        uploadImage.sendKeys(productPage.fi
        productPage.writeOnElement(productPage.category,"Dhaka, Banglades");
        Thread.sleep(5000);

        productPage.writeOnElement(productPage.WritePrice,"$20");
        productPage.writeOnElement(productPage.compareWritePrice,"$15");
        Thread.sleep(5000);

        productPage.writeOnElement(productPage.costPerItem,"13");

        productPage.clickElement(productPage.sellingContinueClick);
        Thread.sleep(5000);

        productPage.writeOnElement(productPage.sippingWeight,"$13");

        productPage.clickElement(productPage.save);

    }
}
