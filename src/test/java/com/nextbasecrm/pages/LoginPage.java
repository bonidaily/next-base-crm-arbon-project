package com.nextbasecrm.pages;


import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement userName;



    @FindBy(name="USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement submit;

    @FindBy(className = "errortext")
    public WebElement errorMessage;

    @FindBy(id = "USER_REMEMBER")
    public WebElement checkbox;

    @FindBy(className = "login-item-checkbox-label")
    public WebElement checkBoxText;

    @FindBy(xpath = "//div[@class='menu-popup-items']//span[@class='menu-popup-item-text']")
    public List<WebElement>optionsUnderProfileName;


    public void login(String username,String password) {
        userName.sendKeys(username);
        this.password.sendKeys(password);
        submit.click();
        // verification that we logged
    }

    public void login1(){
        userName.sendKeys("hr1@cydeo.com");
        password.sendKeys("UserUser");
        submit.click();
    }

}
