package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    public String url = "https://admin.shopify.com/store/mpibju-ki/products";

    public By addProduct = By.xpath("//span[@class='Polaris-Text--root Polaris-Text--bodySm Polaris-Text--semibold']");
    public By title = By.xpath("//input[@id=':r2o:']");
    public By description = By.xpath("//html");
    public By category = By.xpath("//input[@id='ProductCategoryPickerId']");

    public By WritePrice = By.xpath("//input[@id=':r1e:']");
    public By compareWritePrice = By.xpath("//input[@id=':r1e:']");
    public By costPerItem = By.xpath("//input[@id=':r1e:']");

    public By trackQuantityCheck = By.xpath("//input[@id='InventoryTrackingTracked']");
    public By sellingContinueClick = By.xpath("//input[@id='InventoryCardAllowOutOfStockPurchases']");

    public By physicalProduct = By.xpath("//input[@id=':r1n:']");
    public By sippingWeight = By.xpath("//input[@id='ShippingCardWeight']");
    public  By save = By.xpath("//button[@aria-label='Save']");
}
