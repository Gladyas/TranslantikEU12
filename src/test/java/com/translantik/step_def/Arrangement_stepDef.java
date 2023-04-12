package com.translantik.step_def;

import com.translantik.pages.DashBoardPage;
import com.translantik.pages.FleetVehiclePage;
import com.translantik.pages.TranslantikLoginPage;
import com.translantik.utilities.BrowserUtils;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;

public class Arrangement_stepDef {

    FleetVehiclePage fleetVehiclePage= new FleetVehiclePage();
    Actions actions=new Actions(Driver.getDriver());
    TranslantikLoginPage translantikLoginPage=new TranslantikLoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();


    @When("view per page button is displayed")
    public void view_per_page_button_is_displayed() {


        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(fleetVehiclePage.viewPerPageButton));

        //BrowserUtils.sleep(10);
        Assert.assertTrue( fleetVehiclePage.viewPerPageButton.isDisplayed());


    }
    @Then("view per page button is clickable")
    public void view_per_page_button_is_clickable() {

        BrowserUtils.sleep(1);
        Assert.assertTrue(fleetVehiclePage.viewPerPageButton.isEnabled());


    }


    @Then("the value is twenty five by default")
    public void theValueIsTwentyFiveByDefault() {

        String actualValue=  fleetVehiclePage.viewPerPageButton.getText();
        System.out.println("actualValue = " + actualValue);
        int expectedValue=25;
        int actualValueInt = Integer.parseInt(actualValue);
        Assert.assertEquals(expectedValue,actualValueInt);



    }

    @When("view per page button is clicked")
    public void viewPerPageButtonIsClicked() {

        BrowserUtils.sleep(10);
        // WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
        //wait.until(ExpectedConditions.visibilityOf(fleetVehiclePage.viewPerPageButton));
        fleetVehiclePage.viewPerPageButton.click();

    }

    @And("each values are displayed")
    public void eachValuesAreDisplayed() {


        String [] values =new String[4];
        int j=0;
        for (WebElement each : fleetVehiclePage.allValues){
            System.out.println("each values : " + each.getText());
            values[j++]=each.getText();


        }
        System.out.println(Arrays.toString(values));

        int ActualValue1 = Integer.parseInt(values[0]);
        int ActualValue2=  Integer.parseInt(values[1]);
        int ActualValue3= Integer.parseInt((values[2]));
        int ActualValues4=Integer.parseInt(values[3]);


        Assert.assertEquals(10,ActualValue1);
        Assert.assertEquals(25,ActualValue2);
        Assert.assertEquals(50,ActualValue3);
        Assert.assertEquals(100,ActualValues4);


    }

    @Then("each values are selectable")
    public void eachValuesAreSelectable() {

        for (WebElement each : fleetVehiclePage.allValues) {
            System.out.println("each values : " + each.getText());
            Assert.assertTrue(each.isEnabled());
        }


    }

    @When("chassis column and location column is clicked")
    public void chassisColumnAndLocationColumnIsClicked() {


        BrowserUtils.sleep(7);
        fleetVehiclePage.chassisColumn.click();
        BrowserUtils.sleep(2);


        String actualOrder= fleetVehiclePage.chassisColumn.getAttribute("class");
        System.out.println(actualOrder);
    }

    @Then("user can sort columns in ascending order")
    public void userCanSortColumnsInAscendingOrder() {

        String actualOrder= fleetVehiclePage.chassisColumn.getAttribute("class");
        Assert.assertTrue(actualOrder.contains("ascending"));


    }

    @Then("user can sort columns is descending order")
    public void userCanSortColumnsIsDescendingOrder() {

        String actualOrder= fleetVehiclePage.chassisColumn.getAttribute("class");
        Assert.assertTrue(actualOrder.contains("descending"));


    }


    @Given("user on fleet-vehicles page")
    public void userOnFleetVehiclesPage() throws InterruptedException {

        String loginUrl = ConfigurationReader.getProperty("translantik.url");
        Driver.getDriver().get(loginUrl);
        translantikLoginPage.inputUsername.
                sendKeys(ConfigurationReader.getProperty("salesManagerUsername"));
        translantikLoginPage.inputPassword.
                sendKeys(ConfigurationReader.getProperty("salesManagerPassword"));
        translantikLoginPage.loginButton.click();
        BrowserUtils.sleep(5);
        dashBoardPage.fleetVehicleClick();


    }
}
