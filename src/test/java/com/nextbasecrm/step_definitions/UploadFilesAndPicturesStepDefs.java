package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.SendMessagePage;
import com.nextbasecrm.pages.UploadFilesAndPicturesPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class UploadFilesAndPicturesStepDefs extends BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    LoginPage loginPage = new LoginPage();
    UploadFilesAndPicturesPage uploadFilesAndPicturesPage = new UploadFilesAndPicturesPage();

    SendMessagePage sendMessagePage = new SendMessagePage();


    @When("user clicks upload button")
    public void user_clicks_upload_button() {
        wait.until(ExpectedConditions.visibilityOf(uploadFilesAndPicturesPage.uploadButton));
        BrowserUtils.sleep(2);

        uploadFilesAndPicturesPage.uploadButton.click();

    }

    @Then("user is able to upload files and pictures")
    public void user_is_able_to_upload_files_and_pictures() {


        String path = "C:\\Users\\fitor\\OneDrive\\Skrivbord\\cucumber.json";


        uploadFilesAndPicturesPage.uploadFile.sendKeys(path);

    }

    @Then("user should be able to see the file is sent")
    public void userShouldBeAbleToSeeTheFileIsSent() {

        BrowserUtils.sleep(1);

        Assert.assertTrue(uploadFilesAndPicturesPage.fileLocated.isDisplayed());

        BrowserUtils.sleep(1);

    }

    @When("user clicks insert in text button")
    public void userClicksInsertInTextButton() {

        uploadFilesAndPicturesPage.insertButton.click();
    }

    @Then("user is able to see link in text")
    public void userIsAbleToSee() {

        Driver.getDriver().switchTo().frame(sendMessagePage.iframe);

        Assert.assertTrue(uploadFilesAndPicturesPage.linkInText.isDisplayed());

        Driver.getDriver().switchTo().defaultContent();

    }

    @Then("user should be able to remove files and images before sending")
    public void userShouldBeAbleToRemoveFilesAndImagesBeforeSending() {

        uploadFilesAndPicturesPage.cancelInsert.click();


        BrowserUtils.sleep(1);

        uploadFilesAndPicturesPage.cancelButton.click();

        wait.until(ExpectedConditions.invisibilityOf(uploadFilesAndPicturesPage.sendButton));

        Assert.assertFalse( uploadFilesAndPicturesPage.sendButton.isDisplayed());

        BrowserUtils.sleep(1);


    }

    @When("user clicks Message module")
    public void userClicksMessageModule() {
        messageModule.click();
    }
}
