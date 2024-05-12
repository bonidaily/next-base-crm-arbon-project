package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructurePage {
    public CompanyStructurePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "pagetitle")
    public WebElement companyStructure;

    @FindBy(xpath = "//span[.='Add department']")
    public WebElement addDepartment;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentName;

    @FindBy(id = "IBLOCK_SECTION_ID")
    public WebElement parentDepartmentSelect;

    @FindBy(id = "single-user-choice")
    public WebElement selectSupervisor;

    @FindBy(xpath = "//span[.='Company']")
    public WebElement companySector;

    @FindBy(xpath = "//span[.='Accounting']")
    public WebElement accountingSector;

    @FindBy(xpath = "(//div[@class='company-department-employee-info']//div[.='head of department'])[1]")
    public WebElement headOfDepartment;

    @FindBy(xpath = "(//a[@title='Marketing'])[1]")
    public WebElement createdDepartment;

    @FindBy(xpath = "//div[@class='company-department-text']")
    public WebElement cyberVet;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addNewDepartment;
}
