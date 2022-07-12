package regressionTests.signUp;

import baseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SNU004newAccountWithIdenticalData extends BaseTest {
    private String signUpText = "Sign up";
    private String [] paths = {"username", "password"};
    private String [] data = {"Hazim3", "12345"};
    private String signUpError = "This user already exist.";

    @Test(priority = 0)
    public void checkSignUpButton() throws InterruptedException {
        homePage.clickSignUp();
        assertEquals(homePage.checkSignUpButton(), signUpText, "Text is not the same");
    }
    @Test(priority = 1)
    public void checkAccountCreation() throws InterruptedException {
        for (int i=0; i<paths.length; i++){
            homePage.enterRequiredSignUpData(paths[i], data[i]);
        }
        homePage.clickSignUpButton();
        assertEquals(homePage.checkSignUpSuccess(), signUpError, "It was not successful");
    }
}
