package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id="username")
    WebElement userNameInput;
    @FindBy(id="password")
    WebElement passwordInput;

    @FindBy(id="submit")
    WebElement signInButton;

    @FindBy(xpath="//div[@class='sufee-alert alert with-close alert-danger alert-dismissible fade show']/span")
    WebElement errorMessage;

    public void userOpenWebsite(){
        driver.get(ConfigReader.getProperty("ui.url"));
    }
    public void doLogin(String userNameValue,String passwordValue){
        userNameInput.sendKeys(userNameValue);
        passwordInput.sendKeys(passwordValue);
        signInButton.click();
    }
    public void verifyLoginPage(){
        Assert.assertTrue(userNameInput.isDisplayed());
        Assert.assertTrue(passwordInput.isDisplayed());
        Assert.assertTrue(signInButton.isDisplayed());
    }
    public void verifyInvalidLoginErrorIsDisplayed(){
        Assert.assertTrue(errorMessage.isDisplayed());
    }

}
