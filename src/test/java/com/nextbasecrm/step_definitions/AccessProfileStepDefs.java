package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.AccessProfilePage;
import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccessProfileStepDefs extends BasePage {
    AccessProfilePage accessProfilePage = new AccessProfilePage();


    @When("user clicks on My Profile")
    public void user_clicks_on_my_profile() {

        accessProfilePage.myProfile.click();

    }
    @Then("user is able to see five options on my Profile page")
    public void user_is_able_to_see_five_options_on_my_profile_page(List<String>expectedOptions) {

        List<WebElement>actualOptions = accessProfilePage.optionsProfilePage;
        List<String>actualOptionsStr = new ArrayList<>();

        for (WebElement each : actualOptions) {
            actualOptionsStr.add(each.getText());
        }

        Assert.assertEquals(expectedOptions,actualOptionsStr);

    }

    @Then("user should see the email under general tab is same as user account")
    public void userShouldSeeTheEmailUnderGeneralTabIsSameAsUserAccount() {

        String userAccountEmail = myProfile.getText();
        String emailUnderGeneralTab = accessProfilePage.emailUnderGeneralTab.getText();

        Assert.assertEquals(userAccountEmail,emailUnderGeneralTab);
    }
}
