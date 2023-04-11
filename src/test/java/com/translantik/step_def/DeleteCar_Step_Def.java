package com.translantik.step_def;

import com.translantik.pages.DashBoardPage;
import com.translantik.pages.FleetVehiclePage;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class DeleteCar_Step_Def {

    DashBoardPage dashboardPage=new DashBoardPage();
    FleetVehiclePage fleetVehiclePage=new FleetVehiclePage();
    Actions act=new Actions(Driver.getDriver());

    @When("store manager hovering mouse over the three dots")
    public void storeManagerHoveringMouseOverTheThreeDots()  {

    }


    @Then("store manager can see the delete button")
    public void storeManagerCanSeeTheDeleteButton() {
    }

    @And("user manager click the delete button")
    public void userManagerClickTheDeleteButton() {
    }

    @Then("user should see delete confirmation pop up")
    public void userShouldSeeDeleteConfirmationPopUp() {
    }

    @When("driver hovering mouse over the three dots")
    public void driverHoveringMouseOverTheThreeDots() {
    }

    @And("user click the delete button")
    public void userClickTheDeleteButton() {
    }

    @And("user click the yes delete button")
    public void userClickTheYesDeleteButton() {
    }

    @Then("You do not have permission to perform this action message should be displayed")
    public void youDoNotHavePermissionToPerformThisActionMessageShouldBeDisplayed() {
    }

    @When("sales manager hovering mouse over the three dots")
    public void salesManagerHoveringMouseOverTheThreeDots() {
    }
    @Then("Item deleted message should be displayed.")
    public void ıtemDeletedMessageShouldBeDisplayed() {
    }

    @When("sales manager click any vehicle row")
    public void salesManagerClickAnyVehicleRow() {
    }

    @And("click information page delete button")
    public void clickInformationPageDeleteButton() {
    }

    @When("When sales manager click any vehicle row")
    public void whenSalesManagerClickAnyVehicleRow() {
    }

    @And("user get the Chassis Number")
    public void userGetTheChassisNumber() {
    }

    @Then("user should check corresponding car also be removed from the Fleet-Vehicle page")
    public void userShouldCheckCorrespondingCarAlsoBeRemovedFromTheFleetVehiclePage() {
    }

    @When("When store manager click any vehicle row")
    public void whenStoreManagerClickAnyVehicleRow() {
    }


}


