package com.translantik.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FleetVehiclePage extends BasePage {


    @FindBy(xpath="//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageButton;

    @FindBy(xpath="//a[@class='dropdown-item']")
    public List<WebElement> allValues;

    @FindBy(xpath="//th[contains(@class, 'grid-cell grid-header-cell grid-header-cell-ChassisNumber sortable')]")
    public WebElement chassisColumn;


    @FindBy(xpath="//th[@class='grid-cell grid-header-cell grid-header-cell-Location sortable renderable shortenable-label string-cell']")
    public WebElement locationColumn;

    @FindBy(css="[class='fa-filter hide-text']")
    public WebElement filterIcon;

    @FindBy(xpath = "add-filter-button")
    public WebElement manageFilterButton;

    @FindBy(xpath = "//input[@value='Tags']")
    public WebElement tags;

    @FindBy(xpath = "//input[@value='LicensePlate']")
    public WebElement licensePlate;

    @FindBy(xpath = "//label[@title='Driver']")
    public WebElement driver;

    @FindBy(xpath = "//label[@title='Location']")
    public WebElement location;

    @FindBy(xpath = "//label[@title='Chassis Number']")
    public WebElement chassisNumber;

    @FindBy(xpath = "//input[@style='width: 169.172px;']")
    public WebElement mFSearch;


    @FindBy(xpath ="//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr[3]")
    public WebElement anyVehicle;

    @FindBy(xpath = "//*[@class='row']/div/div/div[3]/a")
    public WebElement addEventBut;

    @FindBy(xpath = "//span[@class = 'ui-dialog-title']")
    public WebElement addEventPage1;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveBut;

    @FindBy(xpath = "//span[@class='validation-failed']")
    public WebElement errorMes;













    //comment
}
