package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.CompanyPage;
import com.nextbasecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CompanyStepDefs extends BasePage {

    CompanyPage companyPage = new CompanyPage();

    @When("user clicks Company page")
    public void user_clicks_company_page() {

        companyModule.click();

    }
    @Then("user should be able to see modules:")
    public void user_should_be_able_to_see_modules(List<String> expectedModule) {
    List<WebElement>actualModules = companyPage.modulesInCompany;
    List<String>actualModulesStr = new ArrayList<>();

        for (WebElement each : actualModules) {
            actualModulesStr.add(each.getText());
        }

        Assert.assertEquals(expectedModule,actualModulesStr);
    }

}
