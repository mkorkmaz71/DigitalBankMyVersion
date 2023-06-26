package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage=new LoginPage();

    @Given("user open website")
    public void userOpenWebsite() {
        loginPage.userOpenWebsite();
    }

    @Then("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        loginPage.verifyLoginPage();
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String usernameKey, String passwordKey) {
        loginPage.doLogin(ConfigReader.getProperty(usernameKey),ConfigReader.getProperty(passwordKey));
    }

    @Then("verify invalid login error message is displayed")
    public void verifyInvalidLoginErrorMessageIsDisplayed() {
        loginPage.verifyInvalidLoginErrorIsDisplayed();
    }
}
