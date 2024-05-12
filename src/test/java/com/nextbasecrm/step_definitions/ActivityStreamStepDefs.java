package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStreamStepDefs extends BasePage {
    ActivityStreamPage activityStreamPage1 = new ActivityStreamPage();
    @When("user clicks Activity stream page")
    public void user_clicks_activity_stream_page() {
        activityStreamPage.click();
    }
    @Then("user is able to see following modules")
    public void user_is_able_to_see_following_modules(List<String> expectedModules) {

        BrowserUtils.verifyModules(expectedModules,activityStreamPage1.modulesUnderActivityPage);
    }

    @Then("user clicks more")
    public void userClicksMore() {

        moreModule.click();

    }

    @Then("user should be able to see following modules")
    public void userShouldBeAbleToSeeFollowingModules(List<String>expectedModules) {

        BrowserUtils.verifyModules(expectedModules,activityStreamPage1.modulesUnderMore);

    }
}
