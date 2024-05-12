package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesAndPicturesPage {
    public UploadFilesAndPicturesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Appreciation']")
    public WebElement apprectiation;

    @FindBy(xpath = "(//div[@id='post-buttons-bottom'])[1]/span[@title='Upload files']")
    public WebElement uploadButton;

    @FindBy (name = "bxu_files[]")
    public WebElement uploadFile;

    @FindBy(xpath = "//div[@class='feed-com-files-cont']//div[@class='feed-com-file-wrap']")
    public WebElement fileLocated;

    @FindBy(className = "insert-btn")
    public WebElement insertButton;

    @FindBy(xpath = "//span[.='cucumber.json']")
    public WebElement linkInText;

    @FindBy(className = "del-but")
    public WebElement cancelInsert;

    @FindBy(className = "files-text")
    public WebElement linkBeforeSent;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

}
