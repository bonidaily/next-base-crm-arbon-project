package com.nextbasecrm.pages;

import com.nextbasecrm.step_definitions.AddLinkStepDefs;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLinkPage extends BasePage {
    public AddLinkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@placeholder='Link text']")
    public WebElement linkText;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement linkUrl;

    @FindBy(id = "undefined")
    public WebElement saveButton;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']//a[.='cydeo']")
    public WebElement messageDisplayed;
}
