package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.pages.AndroidLoginPage;
import com.automation.pages.iOSLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps() {
        String env = System.getProperty("platform");

        if (env.equals("ios")) {
            loginPage = new iOSLoginPage();
        } else {
            loginPage = new AndroidLoginPage();
        }
    }

    @Given("user open application")
    public void user_open_application() {
        loginPage.openApplication();
    }

    @Then("verify user is on login screen")
    public void verify_user_is_on_login_screen() {
        Assert.assertTrue(loginPage.isLoginScreenDisplayed());
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String username, String password) {
        loginPage.doLogin(username, password);
    }

    @Then("verify locked out user error message is displayed")
    public void verifyLockedOutUserErrorMessageIsDisplayed(String message) {
        Assert.assertTrue(loginPage.isLockedOutUserErrorMessageIsDisplayed());
        Assert.assertEquals(message, loginPage.getLockedOutErrorMessage());
    }
}
