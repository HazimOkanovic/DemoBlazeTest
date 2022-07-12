package regressionTests.signUp;

import baseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SNU003notEnteringData extends BaseTest {
    private String signUpText = "Sign up";
    private String signUpError = "Please fill out Username and Password.";

    @Test(priority = 0)
    public void checkSignUpButton() throws InterruptedException {
        homePage.clickSignUp();
        assertEquals(homePage.checkSignUpButton(), signUpText, "Text is not the same");
    }
    @Test(priority = 1)
    public void checkAccountCreation() throws InterruptedException {
        homePage.clickSignUpButton();
        assertEquals(homePage.checkSignUpSuccess(), signUpError, "There is no error");
    }
}
