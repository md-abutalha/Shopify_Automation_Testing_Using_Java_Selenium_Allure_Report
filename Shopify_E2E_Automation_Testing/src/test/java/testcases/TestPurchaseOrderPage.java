package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.PurchaseOrderPage;
import pages.RegistrationPage;
import utilities.DriverSetup;

public class TestPurchaseOrderPage extends DriverSetup {
    PurchaseOrderPage purchaseOrderPage = new PurchaseOrderPage();
    RegistrationPage registrationPage = new RegistrationPage();
    ProductPage productPage = new ProductPage();

    @Test(priority = 4, description = "purchase  order test will be test")
    public void PurchaseOrderPage() throws InterruptedException {
        getDriver().get(purchaseOrderPage.url);
        Thread.sleep(3000);
        purchaseOrderPage.clickElement(purchaseOrderPage.createPurchaseOrderClick);
        Thread.sleep(6000);
        WebElement dropdownElement = getDriver().findElement(By.name("paymentTerms"));
        dropdownElement.click();
        Thread.sleep(6000);
        Select select = new Select(dropdownElement);
        Thread.sleep(4000);
        select.selectByVisibleText("Cash on delivery");
        Thread.sleep(4000);

//        calender handle
        purchaseOrderPage.clickElement(purchaseOrderPage.estimatedArrival);
        purchaseOrderPage.clickElement(purchaseOrderPage.date);
        Thread.sleep(4000);

        purchaseOrderPage.clickElement(purchaseOrderPage.shippingCourier);
        Thread.sleep(4000);
        purchaseOrderPage.clickElement(purchaseOrderPage.clickCourier);
        Thread.sleep(4000);

        purchaseOrderPage.writeOnElement(purchaseOrderPage.trackingNumber,"Talha770x");

//        add products
        purchaseOrderPage.clickElement(purchaseOrderPage.addProduct);
        Thread.sleep(4000);
        purchaseOrderPage.writeOnElement(purchaseOrderPage.productSearch,"banana");
        Thread.sleep(4000);
        purchaseOrderPage.clickElement(purchaseOrderPage.bananaSelect);
        Thread.sleep(4000);
        purchaseOrderPage.clickElement(purchaseOrderPage.bananaAdd);
        Thread.sleep(4000);


        purchaseOrderPage.writeOnElement(purchaseOrderPage.suppilyerSkuWrite,"Talha_QA");
        Thread.sleep(4000);
        purchaseOrderPage.clearField(purchaseOrderPage.quantity);
        Thread.sleep(4000);
        purchaseOrderPage.writeOnElement(purchaseOrderPage.quantity,"2");
        Thread.sleep(4000);

        purchaseOrderPage.writeOnElement(purchaseOrderPage.cost,"15");
        Thread.sleep(4000);
        purchaseOrderPage.writeOnElement(purchaseOrderPage.tax,"5");
        Thread.sleep(4000);

        purchaseOrderPage.writeOnElement(purchaseOrderPage.referenceNumber,"01310153553");
        Thread.sleep(4000);
        purchaseOrderPage.writeOnElement(purchaseOrderPage.noteOfSupplyer,"This Created By TALHA");
        Thread.sleep(4000);
        purchaseOrderPage.writeOnElement(purchaseOrderPage.tag,"talha_banana");
        Thread.sleep(4000);


        purchaseOrderPage.clickElement(purchaseOrderPage.save);

    }

}
