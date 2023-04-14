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
        BrowserUtils.sleep(2);
        String actualValue=  fleetVehiclePage.viewPerPageButton.getText();
        System.out.println("actualValue = " + actualValue);
        int expectedValue=25;
        int actualValueInt = Integer.parseInt(actualValue);
        Assert.assertEquals(expectedValue,actualValueInt);



    }

    @When("view per page button is clicked")
    public void viewPerPageButtonIsClicked() {

        BrowserUtils.sleep(3);
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






    @When("user clicks on reset button")
    public void user_clicks_on_reset_button() {
        BrowserUtils.sleep(3);
        fleetVehiclePage.resetButton.click();
        BrowserUtils.sleep(3);





    }
    @Then("user don't have any sorting")
    public void user_don_t_have_any_sorting() {
       BrowserUtils.sleep(2);
        String actualOrder= fleetVehiclePage.chassisColumn.getAttribute("class");
        Assert.assertFalse(actualOrder.contains("ascending"));
        Assert.assertFalse(actualOrder.contains("descending"));





    }
    @Then("user don't have any filtering")
    public void user_don_t_have_any_filtering() {
        BrowserUtils.sleep(3);
        Assert.assertFalse(fleetVehiclePage.licencePlate.isSelected());
    }




    @And("user select licence plate from filters menu")
    public void userSelectLicencePlateFromFiltersMenu() {
        BrowserUtils.sleep(2);
        fleetVehiclePage.licencePlate.click();


    }
}
