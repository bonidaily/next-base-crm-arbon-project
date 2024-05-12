package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.SendAppreciationPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SendAppreciationStepDef extends BasePage {
    SendAppreciationPage sendAppreciationPage = new SendAppreciationPage();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

   /* @Given("user is logged in with valid credentials")
    public void userIsLoggedInWithValidCredentials() {

        loginPage.login1();

    }

    */

    @When("user clicks the module More")
    public void user_clicks_the_module_more() {
        wait.until(ExpectedConditions.visibilityOf(modules("More")));

        modules("More").click();

    }
    @When("user clicks Appreciation under More module")
    public void user_clicks_appreciation_under_more_module() {

        wait.until(ExpectedConditions.visibilityOf(sendAppreciationPage.appreciation));

        sendAppreciationPage.appreciation.click();

    }
    @Then("user should write a message")
    public void user_should_be_able_to_write_a_message_as_a_first_mandatory_field() {
        WebElement iframe = sendAppreciationPage.iframe;
        Driver.getDriver().switchTo().frame(iframe);

        sendAppreciationPage.writeMessage.sendKeys("Hi");

        Driver.getDriver().switchTo().defaultContent();
    }

    @And("user should remove delivery to all employees")
    public void userShouldRemoveDeliveryToAllEmployees() {

        wait.until(ExpectedConditions.elementToBeClickable(sendAppreciationPage.removeAllEmployes));

        sendAppreciationPage.removeAllEmployes.click();

    }
    @Then("user should specify at least one person")
    public void user_should_specify_at_least_one_person_to_send_the_message_as_a_second_mandatory_field() {


        wait.until(ExpectedConditions.elementToBeClickable(sendAppreciationPage.addMore));

        sendAppreciationPage.addMore.click();

        wait.until(ExpectedConditions.elementToBeClickable(sendAppreciationPage.employeesAndDepartments));

        sendAppreciationPage.employeesAndDepartments.click();

        wait.until(ExpectedConditions.elementToBeClickable(sendAppreciationPage.addPerson));

        sendAppreciationPage.addPerson.click();

        wait.until(ExpectedConditions.elementToBeClickable(sendAppreciationPage.closePopUp));

        sendAppreciationPage.closePopUp.click();


    }
    @When("user clicks send")
    public void user_clicks_send() {

        BrowserUtils.sleep(1);

        wait.until(ExpectedConditions.elementToBeClickable(sendAppreciationPage.sendButton));
        sendAppreciationPage.sendButton.click();

    }

    @Then("user should be able to see the message on Activity Stream mainpage")
    public void userShouldBeAbleToSeeHisHerMessageOnActivityStreamMainpage() {

        BrowserUtils.sleep(1);

        wait.until(ExpectedConditions.visibilityOf(sendAppreciationPage.messageDisplayed("Hi")));

        Assert.assertTrue(sendAppreciationPage.messageDisplayed("Hi").isDisplayed());


    }

    @Then("user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String expectedMessage) {

        String actualMessage = sendAppreciationPage.errorMessage.getText();
        System.out.println(expectedMessage);
        System.out.println(actualMessage);

        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @When("user does not specify at least one person to recieve the message")
    public void userDoesNotSpecifyAtLeastOnePersonToRecieveTheMessage() {

        sendAppreciationPage.removeAllEmployes.click();
        BrowserUtils.sleep(1);

    }

    @Then("user should be able to see delivery by default is {string}")
    public void userShouldBeAbleToSeeDeliveryByDefaultIsAllEmployees(String expected) {
        BrowserUtils.sleep(1);

        String actualText = sendAppreciationPage.allEmployes.getText();
        Assert.assertEquals(expected,actualText);

        Assert.assertTrue(sendAppreciationPage.allEmployes.isDisplayed());


    }

    @When("user clicks cancel")
    public void userClicksCancel() {

        BrowserUtils.sleep(1);
        sendAppreciationPage.cancelButton.click();

    }

    @Then("user is able to cancel sending")
    public void userIsAbleToCancelSending() {

        wait.until(ExpectedConditions.invisibilityOf(sendAppreciationPage.sendButton));
        Assert.assertFalse(sendAppreciationPage.sendButton.isDisplayed());

    }


}
