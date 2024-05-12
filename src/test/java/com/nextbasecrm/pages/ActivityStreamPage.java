package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class ActivityStreamPage {
    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[contains(@class,'microblog-top-tabs-visible')]//div/span")
    public List<WebElement>modulesUnderActivityPage;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span")
    public List<WebElement>modulesUnderMore;

}
