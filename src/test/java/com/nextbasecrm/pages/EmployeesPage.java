package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage {
    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='main-buttons']//a[@class='main-buttons-item-link']")
    public List<WebElement>modules;

    @FindBy(id = "top_menu_id_company_3271504278")
    public WebElement company;
}
