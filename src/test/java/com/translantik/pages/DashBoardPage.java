package com.translantik.pages;

import com.translantik.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage {
    FleetVehiclePage fleetVehiclePage=new FleetVehiclePage();
    Actions actions=new Actions(Driver.getDriver());


    @FindBy(css = ".user-menu-dropdown>a")
    public WebElement userMenu;

    @FindBy(linkText = "Logout")
    public WebElement logOutBtn;

    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Actions action = new Actions(Driver.getDriver());
    public void navigateTo(String tab, String module) {
        waitUntilLoaderScreenDisappear();
        action.moveToElement(Driver.getDriver().findElement(By.linkText(tab))).perform();
        Driver.getDriver().findElement(By.linkText(module)).click();
    }

    @FindBy(xpath="//*[@id='main-menu']/ul/li[2]/a/span")
    public  WebElement fleet;

    @FindBy(xpath="//span[.='Vehicles']")
    public  WebElement fleetVehicle;

    @FindBy(xpath="//*[@id='main-menu']/ul/li[1]/a/span")
    public  WebElement fleetDriver;

    @FindBy(xpath="//span[@class='title title-level-2']")
    public  WebElement fleetVehicleDriver;




    public void fleetVehicleClick() throws InterruptedException {
        fleetVehiclePage.waitUntilLoaderScreenDisappear();
        Thread.sleep(2000);
        actions.click(fleet).perform();
        actions.click(fleetVehicle).perform();
        fleetVehiclePage.waitUntilLoaderScreenDisappear();
        Thread.sleep(2000);
    }

    public void fleetVehicleClickDriver() throws InterruptedException {
        fleetVehiclePage.waitUntilLoaderScreenDisappear();
        Thread.sleep(2000);
        actions.click(fleetDriver).perform();
        actions.click(fleetVehicleDriver).perform();
        fleetVehiclePage.waitUntilLoaderScreenDisappear();
        Thread.sleep(2000);
    }
}
