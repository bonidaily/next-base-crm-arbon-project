package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.PollTabPage;
import com.nextbasecrm.pages.SendAppreciationPage;
import com.nextbasecrm.pages.SendMessagePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PollTabStepDefs extends BasePage {
    PollTabPage pollTabPage = new PollTabPage();
    SendAppreciationPage sendAppreciationPage = new SendAppreciationPage();
    @Then("usel clicks Poll Tab")
    public void usel_clicks_poll_tab() {

        pollModule.click();

    }
    @Then("use should be able to see All employees by default")
    public void use_should_be_able_to_see_all_employees_by_default() {
        BrowserUtils.sleep(1);

        Assert.assertTrue(sendAppreciationPage.allEmployes.isDisplayed());

    }

    @Then("user writes a message")
    public void user_writes_a_message() {

        WebElement iframe = sendAppreciationPage.iframe;
        Driver.getDriver().switchTo().frame(iframe);

        sendAppreciationPage.writeMessage.sendKeys("Please Complete the survey");

        Driver.getDriver().switchTo().defaultContent();

    }
    @Then("user writes a question")
    public void user_writes_a_quesion() {
        BrowserUtils.sleep(1);
       pollTabPage.question.sendKeys("Do you enjoy your life as SDET");
    }
    @Then("user writes first answer")
    public void user_writes_first_answer() {
        BrowserUtils.sleep(1);

        pollTabPage.firstAnswer.sendKeys("Yes");

    }
    @Then("user writes second answer")
    public void user_writes_second_answer() {
        BrowserUtils.sleep(1);
       pollTabPage.secondAnswer.sendKeys("No");
    }

    @Then("user clicks Poll Tab")
    public void userClicksPollTab() {
        BrowserUtils.sleep(1);
        pollModule.click();
    }

    @Then("user should be able to see the survey displayed")
    public void userShouldBeAbleToSeeTheSurveyDisplayed() {
        BrowserUtils.sleep(1);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pollTabPage.survey));

        Assert.assertTrue(pollTabPage.secondAnswer.isDisplayed());

    }

    @Then("user is able to click on multiple choices")
    public void userIsAbleToClickOnMultipleChoices() {

        pollTabPage.allowMultipleChoice.click();

        BrowserUtils.sleep(1);

        Assert.assertTrue(pollTabPage.allowMultipleChoice.isSelected());



    }

    @Then("user should writes a message")
    public void userShouldWritesAMessage() {

        WebElement iframe = sendAppreciationPage.iframe;
        Driver.getDriver().switchTo().frame(iframe);

        sendAppreciationPage.writeMessage.sendKeys("Please Complete the survey,thank you");

        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("user writes a new message")
    public void userWritesANewMessage() {
        WebElement iframe = sendAppreciationPage.iframe;
        Driver.getDriver().switchTo().frame(iframe);

        sendAppreciationPage.writeMessage.sendKeys("Please be kind and complete the survey");

        Driver.getDriver().switchTo().defaultContent();
    }
}
