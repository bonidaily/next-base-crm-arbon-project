package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.gl.Logo;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LogoutStepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();
    @When("user clicks on the profile name")
    public void user_clicks_on_the_profile_name() {

    myProfile.click();

    }
    @Then("user should be able to click Log out")
    public void user_should_be_able_to_click_log_out() {

    logout.click();

    }

    @Then("user should be able to see five options")
    public void userShouldBeAbleToSeeOptions(List<String>expectedOptions) {

        List<WebElement> actualOptions = loginPage.optionsUnderProfileName;
        List<String>actualOptionsStr = new ArrayList<>();

        for (WebElement each : actualOptions) {
            actualOptionsStr.add(each.getText());
        }
        Assert.assertEquals(expectedOptions,actualOptionsStr);

    }
}
