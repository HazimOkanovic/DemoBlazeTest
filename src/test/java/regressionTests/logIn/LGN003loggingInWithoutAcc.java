package regressionTests.logIn;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LGN003loggingInWithoutAcc extends BaseTest {
    private String logInText = "Log in";
    private String [] path = {"username", "password"};
    private String [] data = {"Hazim89", "12345"};
    private String errorMessage = "User does not exist.";

    @Test (priority = 0)
    public void checkLogInButton() throws InterruptedException {
        homePage.clickLogIn();
        assertEquals(homePage.checkLogInButton(), logInText, "The text is not the same");
    }
    @Test (priority = 1)
    public void checkLoggingIn() throws InterruptedException {
        for (int i = 0; i< path.length; i++){
            homePage.enterRequiredLogInData(path[i], data[i]);
        }
        homePage.clickLogInButton();
        Thread.sleep(2000);
        assertEquals(driver.switchTo().alert().getText(), errorMessage, "The success message is not the same");
    }
}
