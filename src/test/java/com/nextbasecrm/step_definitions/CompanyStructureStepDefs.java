package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.CompanyStructurePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompanyStructureStepDefs extends BasePage {
    LoginPage loginPage = new LoginPage();
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    @Given("user is logged in with valid {string} and {string}")
    public void user_is_logged_in_with_valid_and(String username, String password) {

        loginPage.login(username,password);

    }
    @When("user clicks on Employee page")
    public void user_clicks_on_employee_page() {

        employees.click();

    }
    @Then("user should see Company Structure")
    public void user_should_see_company_structure() {

        Assert.assertTrue(companyStructurePage.companyStructure.isDisplayed());

    }

    @Given("user is logged in with username {string} and password {string}")
    public void userIsLoggedInWithUsernameAndPassword(String username, String password) {
        loginPage.login(username,password);
    }

    @And("user click Add Department")
    public void userClickAddDepartment() {

        companyStructurePage.addDepartment.click();

    }

    @Then("user should be able to write department name")
    public void userShouldBeAbleToWriteDepartmentName() {

        companyStructurePage.departmentName.sendKeys("Marketing");

    }

    @And("user should be able to select parent department")
    public void userShouldBeAbleToSelectParentDepartment() {
        Select department = new Select(companyStructurePage.parentDepartmentSelect);
        department.selectByValue("134");
    }

    @And("user should be able to select supervisor from structure")
    public void userShouldBeAbleToSelectSupervisorFromStructure() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(companyStructurePage.selectSupervisor));

        companyStructurePage.selectSupervisor.click();

        wait.until(ExpectedConditions.elementToBeClickable(companyStructurePage.companySector));

        companyStructurePage.companySector.click();

        BrowserUtils.sleep(1);

        companyStructurePage.cyberVet.click();

        wait.until(ExpectedConditions.visibilityOf(companyStructurePage.accountingSector));

        companyStructurePage.accountingSector.click();

        wait.until(ExpectedConditions.visibilityOf(companyStructurePage.headOfDepartment));

        companyStructurePage.headOfDepartment.click();




    }

    @When("user clicks Add")
    public void userClicksAdd() {
        BrowserUtils.sleep(1);

        companyStructurePage.addNewDepartment.click();
    }

    @Then("user should be able to see")
    public void userShouldBeAbleToSee() {

        BrowserUtils.sleep(1);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(companyStructurePage.createdDepartment));

        Assert.assertTrue(companyStructurePage.createdDepartment.isDisplayed());

    }

    @Given("user is logged in with given {string} and {string}")
    public void userIsLoggedInWithGivenAnd(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("user should not be able to see Add department")
    public void userShouldNotBeAbleToSeeAddDepartment() {

        BrowserUtils.sleep(1);


       try{
           if(companyStructurePage.addDepartment.isDisplayed()){
               System.out.println("Element is present on the pag");
           }
       }catch (NoSuchElementException e){
           System.out.println("Element is not present on the page ");
       }



    }
}
