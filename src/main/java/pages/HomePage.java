package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static utils.Utils.waitPresent;

public class HomePage {
    WebDriver driver;
    private By logIn = By.xpath("//div//ul//li//a[@id='login2']");
    private By signUp = By.xpath("//div/ul//li//a[@id='signin2']");
    private By signUpTextField = By.xpath("//div//div//h5[@id= 'signInModalLabel']");
    private By logInTextField = By.xpath("//div//div//h5[@id= 'logInModalLabel']");
    private By logInButton = By.xpath("//div//div//button[@onclick= 'logIn()']");
    private By signUpButton = By.xpath("//div/div//button[@onclick='register()']");
    private By loginSuccess = By.xpath("//div//ul//li//a[@id = 'nameofuser']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickLogIn(){
       waitPresent(driver, logIn);
       driver.findElement(logIn).click();
    }
    public void clickSignUp(){
        waitPresent(driver, signUp);
        driver.findElement(signUp).click();
    }
    public String checkSignUpButton() throws InterruptedException{
    Thread.sleep(2000);
    waitPresent(driver, signUpTextField);
    return driver.findElement(signUpTextField).getText();
    }
    public String checkLogInButton() throws InterruptedException{
        Thread.sleep(2000);
        waitPresent(driver, logInTextField);
        return driver.findElement(logInTextField).getText();
    }
    public String checkLogInSuccess(){
        waitPresent(driver, loginSuccess);
        return driver.findElement(loginSuccess).getText();
    }
    public String checkSignUpSuccess() throws InterruptedException{
        Thread.sleep(2000);
        return driver.switchTo().alert().getText();
    }
    public void enterRequiredSignUpData(String path, String data){
        String element = "//div//form//div//input[@id= 'sign-%s']";
        element = String.format(element, path);
        waitPresent(driver, By.xpath(element));
        driver.findElement(By.xpath(element)).sendKeys(data);
    }
    public void enterRequiredLogInData(String path, String data){
        String element = "//div//form//div//input[@id= 'login%s']";
        element = String.format(element, path);
        waitPresent(driver, By.xpath(element));
        driver.findElement(By.xpath(element)).sendKeys(data);
    }
    public void clickLogInButton(){
        waitPresent(driver,logInButton);
        driver.findElement(logInButton).click();
    }
    public void clickSignUpButton(){
        waitPresent(driver,signUpButton);
        driver.findElement(signUpButton).click();
    }
    public CartPage clickDevice(String deviceName){
        String elementPath = "//div//div[@class= 'card-block']//h4//a[contains(text(), '%s')]";
        elementPath = String.format(elementPath, deviceName);
        waitPresent(driver, By.xpath(elementPath));
        driver.findElement(By.xpath(elementPath)).click();
        return new CartPage(driver);
    }
}
