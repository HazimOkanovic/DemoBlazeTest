package smokeTest;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import static org.testng.Assert.assertEquals;

public class SmokeTest extends BaseTest {
    private String deviceName = "Nexus 6";
    private String price = "650";
    private String priceCheckOut = "Total: 650";
    private String alertText = "Product added";
    private String [] infoPaths = {"name", "country", "city", "card", "month", "year"};
    private String [] requiredInfo = {"Hazim Okanovic", "Bosnia and Herzegovina", "Zepce", "1234123412345", "January", "2022"};
    private String successMessage = "Thank you for your purchase!";
    CartPage cartPage;

    @Test (priority = 0)
    public void checkNameOfDevice(){
        cartPage = homePage.clickDevice("Nexus");
        assertEquals(cartPage.checkDeviceName(), deviceName, "Device names do not match");
    }
    @Test (priority = 1)
    public void checkAlertText() throws InterruptedException {
        cartPage.clickAddToCartButton();
        assertEquals(cartPage.checkAlertText(), alertText, "The text is not the same");
    }
    @Test (priority = 2)
    public void checkPriceInCart() {
        cartPage.clickOkNotification();
        cartPage.goToCart();
        assertEquals(cartPage.checkPrice(), price, "The prices do not match");
    }
    @Test (priority = 3)
    public void checkPriceCheckOut() throws InterruptedException {
        cartPage.clickPlaceOrder();
        assertEquals(cartPage.checkPriceCheckOut(), priceCheckOut, "Prices do not match");
    }
    @Test(priority = 4)
    public void checkRequiredInfo() {
        for (int i = 0; i < infoPaths.length; i++) {
            cartPage.enterRequiredInfo(infoPaths[i], requiredInfo[i]);
        }
        cartPage.clickPurchase();
        assertEquals(cartPage.checkSuccess(), successMessage, "Success message is not the same");
    }
}
