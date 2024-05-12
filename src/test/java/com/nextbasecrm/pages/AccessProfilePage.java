package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccessProfilePage {
    public AccessProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfile;

    @FindBy(xpath = "//div[@id='profile-menu-filter']//a")
    public List<WebElement>optionsProfilePage;


    @FindBy(className = "user-profile-nowrap-second")
    public WebElement emailUnderGeneralTab;
}
