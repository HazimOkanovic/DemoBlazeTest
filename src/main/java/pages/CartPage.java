package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Utils.waitPresent;

public class CartPage {
    WebDriver driver;
    private By addToCartButton = By.xpath("//div//div//a[@class='btn btn-success btn-lg']");
    private By cart = By.xpath("//div//div//a[@id='cartur']");
    private By placeOrderButton = By.xpath("//div//div//button[@class='btn btn-success']");
    private By purchaseButton = By.xpath("//div//div//button[@onClick='purchaseOrder()']");
    private By deviceNameField = By.xpath("//div//div//h2[@class='name']");
    private By priceFieldInCart = By.xpath("//div//div//h3[@id='totalp']");
    private By priceFieldCheckOut = By.xpath("//div//div//form//label[@id='totalm']");
    private By successMessage = By.xpath("//div[contains(@class, 'sweet-alert')]//h2");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddToCartButton(){
        waitPresent(driver, addToCartButton);
        driver.findElement(addToCartButton).click();
    }
    public String checkAlertText() throws InterruptedException {
        Thread.sleep(1000);
        return driver.switchTo().alert().getText();
    }
    public void clickOkNotification() {
        driver.switchTo().alert().accept();
    }
    public void goToCart(){
        waitPresent(driver, cart);
        driver.findElement(cart).click();
    }
    public void clickPlaceOrder(){
        waitPresent(driver, placeOrderButton);
        driver.findElement(placeOrderButton).click();
    }
    public void enterRequiredInfo(String path, String info){
        String elementPath = "//div//div//input[@id='%s']";
        elementPath = String.format(elementPath, path);
        waitPresent(driver, By.xpath(elementPath));
        driver.findElement(By.xpath(elementPath)).sendKeys(info);
    }
    public void clickPurchase(){
        waitPresent(driver, purchaseButton);
        driver.findElement(purchaseButton).click();
    }
    public String checkDeviceName(){
        waitPresent(driver, deviceNameField);
        return driver.findElement(deviceNameField).getText();
    }
    public String checkPrice(){
        waitPresent(driver, priceFieldInCart);
        return driver.findElement(priceFieldInCart).getText();
    }
    public String checkPriceCheckOut() throws InterruptedException{
        Thread.sleep(1000);
        return driver.findElement(priceFieldCheckOut).getText();
    }
    public String checkSuccess() {
        waitPresent(driver, successMessage);
        return driver.findElement(successMessage).getText();
    }
}
