package regressionTests.logIn;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LGN001successfulLogIn extends BaseTest {
    private String logInText = "Log in";
    private String [] path = {"username", "password"};
    private String [] data = {"Hazim2", "12345"};
    private String logInSuccess = "Welcome Hazim2";

    @Test (priority = 0)
    public void checkLogInButton() throws InterruptedException {
        homePage.clickLogIn();
        assertEquals(homePage.checkLogInButton(), logInText, "The text is not the same");
    }
    @Test (priority = 1)
    public void checkLoggingIn(){
        for (int i = 0; i< path.length; i++){
            homePage.enterRequiredLogInData(path[i], data[i]);
        }
        homePage.clickLogInButton();
        assertEquals(homePage.checkLogInSuccess(), logInSuccess, "The success message is not the same");
    }
}
