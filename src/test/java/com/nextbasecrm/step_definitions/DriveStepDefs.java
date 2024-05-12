package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.DrivePage;
import com.nextbasecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DriveStepDefs extends BasePage {
    DrivePage drivePage1 = new DrivePage();

    @When("user clicks Drive page")
    public void user_clicks_drive_page() {

        drivePage.click();

    }
    @Then("user is able to see {int} modules")
    public void user_is_able_to_see_modules(int expectednrModules, List<String > expectedModules) {

        List<WebElement>actualModules = drivePage1.modulesInDrive;
        List<String> actualModulesStr = new ArrayList<>();

        for (WebElement each : actualModules) {
            actualModulesStr.add(each.getText());
            if(each.getText().isEmpty()){
                actualModulesStr.remove(each.getText());
            }
        }

        Assert.assertEquals(expectedModules,actualModulesStr);

        BrowserUtils.sleep(1);

    }


}
