package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollTabPage {
    public PollTabPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "question_0")
    public WebElement question;

    @FindBy(id = "answer_0__0_")
    public WebElement firstAnswer;

    @FindBy(id = "answer_0__1_")
    public WebElement secondAnswer;

    @FindBy(xpath = "//div[.='Do you enjoy SDET']")
    public WebElement survey;

    @FindBy(id = "multi_0")
    public WebElement allowMultipleChoice;
}
