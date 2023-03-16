package ui;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.Driver;

public class LoginTests {

    @AfterTest(alwaysRun = true)
    public void cleanUp(){
        //Driver.close();
    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][] {
                { "Login-1", "Pass-1"},
                { "Login-2", "Pass-2"},
                { "Login-1", "Pass-2"},
                { "Login-2", "Pass-1"},
        };
    }

    @Test(dataProvider = "loginData")
    public void loginWithWrongCredentials(String username, String password){

        new LoginPage().fillUsername(username)
                .fillPassword(password)
                .clickConfirmButton();
        Assert.assertTrue(new LoginPage().isErrorMessageShown(), "There is an error found during login");
    }


}
