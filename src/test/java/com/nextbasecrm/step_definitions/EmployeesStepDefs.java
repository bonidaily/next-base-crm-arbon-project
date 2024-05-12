package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.EmployeesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class EmployeesStepDefs extends BasePage {
    EmployeesPage employeesPage = new EmployeesPage();

    @When("user clicks employees")
    public void user_clicks_employees() {
        employees.click();
    }

    @Then("user should be able to see {int} modules")
    public void user_should_be_able_to_see_modules(Integer int1, List<String> expectedModules) {
        List<WebElement> modules = employeesPage.modules;
        List<String> modulesToStr = new ArrayList<>();

        for (WebElement each : modules) {
            modulesToStr.add(each.getText().trim());
            if(modulesToStr.contains("")){
                modulesToStr.remove(each.getText());
            }

        }
        Assert.assertEquals(expectedModules,modulesToStr);

    }

    @Then("user is able to see the Company Structure as default")
    public void userIsAbleToSeeTheCompanyStructureAsDefault() {

        Assert.assertTrue(employeesPage.company.isDisplayed());

    }
}
