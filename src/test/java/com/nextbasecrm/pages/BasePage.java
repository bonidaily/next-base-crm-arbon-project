package com.nextbasecrm.pages;


import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user-block")
    public WebElement myProfile;

    @FindBy(xpath = "//span[.='Message']")
    public WebElement messageModule;

    @FindBy(xpath = "//span[.='Task']")
    public WebElement taskModule;

    @FindBy(xpath = "//span[.='Event']")
    public WebElement eventModule;

    @FindBy(xpath = "//span[.='Poll']")
    public WebElement pollModule;

    @FindBy(xpath = "//span[.='More']")
    public WebElement moreModule;

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employees;

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStreamPage;

    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement drivePage;

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyModule;

    @FindBy(id = "user-block")
    public WebElement profile;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logout;

    /*
    you can call this method and put a page as an argument  which you want to access and
     */
    public static WebElement pages(String text){
        return  Driver.getDriver().findElement(By.xpath("//a[@title='"+text+"']"));
    }

    /*
    you can call this method and put a module as an argument  which you want to access
     */

    public static WebElement modules(String text){
        return  Driver.getDriver().findElement(By.xpath("//span[.='"+text+ "']"));
    }



}
