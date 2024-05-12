package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagePage {

    public SendMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Appreciation']")
    public WebElement appreciation;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement writeMessage;

    @FindBy (xpath = "//span[@data-id='UA']")
    public WebElement allEmployes;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(className = "feed-add-error")
    public WebElement errorMessage;

    @FindBy(className = "feed-add-post-del-but")
    public WebElement removeAllEmployes;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMore;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//div[@id='bx-lm-category-relation-129']//div[.='hr1@cydeo.com']")
    public WebElement addPerson;



    @FindBy(xpath = "//div[@id='BXSocNetLogDestination']//span[@class='popup-window-close-icon']")
    public WebElement closePopUp;


    public WebElement messageDisplayed(String message){
        return Driver.getDriver().findElement(By.xpath("//div[.='"+message+"']"));
    }



}
