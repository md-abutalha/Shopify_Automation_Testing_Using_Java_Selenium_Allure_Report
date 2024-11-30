package pages;

import org.openqa.selenium.By;

public class PurchaseOrderPage extends BasePage{
    public String url = "https://admin.shopify.com/store/mpibju-ki/purchase_orders?selectedView=all";

    public By createPurchaseOrderClick = By.xpath("//span[@class='Polaris-Text--root Polaris-Text--bodySm Polaris-Text--semibold']");
    public By paymentTerms = By.xpath("//select[@id=':r9i:']");

//    calender
    public By estimatedArrival = By.name("shipNotices[0].arrivesAt");
    public By date = By.xpath("//span[normalize-space()='2']");

    public By shippingCourier = By.name("shipNotices[0].carrierName");
    public By clickCourier = By.xpath("//div[contains(text(),'4PX')]");


    public By trackingNumber = By.name("shipNotices[0].trackingNumber");


//    add product
    public By addProduct = By.xpath("//span[normalize-space()='Browse']");
    public By productSearch = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[19]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public By bananaSelect = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[19]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public By bananaAdd = By.xpath("//span[@class='Polaris-Text--root Polaris-Text--bodySm Polaris-Text--semibold']");


    public By suppilyerSkuWrite = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/table[1]/tr[1]/td[2]/span[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public By quantity = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/table[1]/tr[1]/td[3]/div[1]/span[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public By cost = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/table[1]/tr[1]/td[4]/span[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public By tax = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/table[1]/tr[1]/td[5]/span[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");


    public By referenceNumber = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public By noteOfSupplyer = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/textarea[1]");
    public By tag = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");

    public By save = By.xpath("//button[normalize-space()='Save as draft']");

}
