package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.AccessProfilePage;
import com.nextbasecrm.pages.AddLinkPage;
import com.nextbasecrm.pages.SendMessagePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class AddLinkStepDefs {
    SendMessagePage sendMessagePage = new SendMessagePage();

    AddLinkPage addLinkPage = new AddLinkPage();

    @When("user clicks link")
    public void user_clicks_link() {

        addLinkPage.linkButton.click();

    }

    @Then("user is able to add a Link Url")
    public void user_is_able_to_add_a_link_url() {
        addLinkPage.linkUrl.sendKeys("www.cydeo.com");
    }

    @Then("user is able to add a Link text")
    public void user_is_able_to_add_a_link_text() {

        addLinkPage.linkText.sendKeys("cydeo");

    }

    @When("user clicks Save")
    public void userClicksSave() {

        addLinkPage.saveButton.click();

        BrowserUtils.sleep(1);

    }

    @Then("user can see the link displayed in main page of Message")
    public void userCanSeeTheLinkDisplayedInMainPageOfMessage() {

        BrowserUtils.sleep(1);

        String text = addLinkPage.messageDisplayed.getText();
        System.out.println(text);

        Assert.assertTrue(sendMessagePage.messageDisplayed("cydeo").isDisplayed());


    }

    @When("user clicks the link that is displayed in main page of Message")
    public void userClicksTheLinkThatIsDisplayedInMainPageOfMessage() {

        BrowserUtils.sleep(1);

        addLinkPage.messageDisplayed.click();

    }


    @Then("user is redirected to the specified url")
    public void userIsRedirectedToTheSpecifiedUrl() {


        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String each : windows) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getCurrentUrl().contains("cydeo"))
                break;
        }


       Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cydeo"));

        System.out.println(Driver.getDriver().getTitle());


    }
}

