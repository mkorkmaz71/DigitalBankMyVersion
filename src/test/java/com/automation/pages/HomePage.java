package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id="page-title")
    WebElement pageTitle;

    public  void verifyUserIsOnHomePage(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
}
