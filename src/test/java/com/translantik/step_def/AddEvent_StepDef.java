package com.translantik.step_def;

import com.translantik.pages.DashBoardPage;
import com.translantik.pages.FleetVehiclePage;
import com.translantik.pages.TranslantikLoginPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;


public class AddEvent_StepDef extends TranslantikLoginPage {

    FleetVehiclePage fleetVehiclePage = new FleetVehiclePage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("User should click on any vehicle")
    public void user_should_click_on_any_vehicle() {
        BrowserUtils.sleep(5);
        fleetVehiclePage.anyVehicle.click();
    }
    @Then("User should land on Add Event page")
    public void user_should_land_on_add_event_page() {
        String expectedResult = "Add Event\n" +
                "Add Event";
        String actualResult = fleetVehiclePage.addEventBut.getText();
        System.out.println("actualResult = " + actualResult);
        Assert.assertEquals(expectedResult,actualResult);

        Driver.closeDriver();
    }
    //--------------------------------------------------------------------

    @Then("User should click Add Event button")
    public void userShouldClickAddEventButton() {
        Assert.assertTrue(fleetVehiclePage.addEventBut.isEnabled());

    }

    //------------------------------------------------------------------

    @Then("Driver should not click Add Event button")
    public void driverShouldClickAddEventButton() {

        BrowserUtils.sleep(5);
        Assert.assertFalse(fleetVehiclePage.addEventBut.isEnabled());

    }

    //------------------------------------------------------------------


    @And("User can click Add Event button")
    public void userCanClickAddEventButton() {
        BrowserUtils.sleep(10);
        fleetVehiclePage.addEventBut.click();

    }

    @Then("Add Event page should pop up")
    public void addEventPageShouldPopUp() {
        BrowserUtils.sleep(5);
        String expectedPage = "Add Event";
        String actualPage = fleetVehiclePage.addEventPage1.getText();
        System.out.println("actualPage = " + actualPage);
        Assert.assertEquals(expectedPage,actualPage);

        fleetVehiclePage.cancelBut.click();
    }

    //-----------------------------------------------------------


    @And("User can click save button")
    public void userCanClickSaveButton() {
        BrowserUtils.sleep(5);
        fleetVehiclePage.saveBut.click();

    }

    @Then("User should see the error message")
    public void userShouldSeeTheErrorMessage() {
        BrowserUtils.sleep(5);
        String actualText = fleetVehiclePage.errorMes.getText();
        System.out.println("actualText = " + actualText);
        Assert.assertTrue(fleetVehiclePage.errorMes.isDisplayed());

        fleetVehiclePage.cancelBut.click();
    }
}
