package regressionTests.logIn;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LGN002logInWithoutEnteringData extends BaseTest {
    private String logInText = "Log in";
    private String path = "username";
    private String data = "Hazim2";
    private String logInError = "Please fill out Username and Password.";

    @Test(priority = 0)
    public void checkLogInButton() throws InterruptedException {
        homePage.clickLogIn();
        assertEquals(homePage.checkLogInButton(), logInText, "The text is not the same");
    }
    @Test (priority = 1)
    public void checkLoggingIn() {
        homePage.enterRequiredLogInData(path, data);
        homePage.clickLogInButton();
        assertEquals(driver.switchTo().alert().getText(), logInError, "The error is not the same");
    }
}
