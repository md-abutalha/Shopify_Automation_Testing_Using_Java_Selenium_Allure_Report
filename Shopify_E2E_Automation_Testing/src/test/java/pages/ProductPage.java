package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
    public String url = "https://admin.shopify.com/store/mpibju-ki/products";

    public By addProduct = By.xpath("//span[@class='Polaris-Text--root Polaris-Text--bodySm Polaris-Text--semibold']");
    public By title = By.xpath("//input[@name='title']");
    public By description = By.xpath("/html[1]/body[1]");

    public By uploadImage = By.xpath("//span[normalize-space()='Upload new']");
    public String filePath = "D:\\SQA\\java-with-selenium-automation-official\\AssignmentByOfficialCompany\\4Beats_Task\\Shopify_Automation_Testing_Using_Java_Selenium\\banana.png";

    public By category = By.xpath("//input[@id='ProductCategoryPickerId']");

    public By WritePrice = By.name("price");
    public By compareWritePrice = By.name("compareAtPrice");
    public By costPerItem = By.name("unitCost");

//    public By trackQuantityCheck = By.xpath("//input[@id='InventoryTrackingTracked']");
    public By sellingContinueClick = By.xpath("//input[@id='InventoryCardAllowOutOfStockPurchases']");

    public By physicalProduct = By.xpath("//input[@id=':r1n:']");
    public By sippingWeight = By.xpath("//input[@id='ShippingCardWeight']");
    public  By save = By.xpath("//button[@aria-label='Save']");

    public By productType = By.xpath("//input[@id='ProductOrganizationCustomType']");


}
