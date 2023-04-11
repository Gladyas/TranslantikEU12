package com.translantik.step_def;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */

import com.translantik.pages.DashBoardPage;
import com.translantik.pages.DashboardPage;
import com.translantik.pages.FleetVehiclePage;
import com.translantik.pages.TranslantikLoginPage;
import com.translantik.utilities.ConfigurationReader;
import com.translantik.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

public class Hooks {
    FleetVehiclePage fleetVehiclePage=new FleetVehiclePage();
    Actions actions=new Actions(Driver.getDriver());
    TranslantikLoginPage translantikLoginPage=new TranslantikLoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();

    //import from io.cucumber.java not from junit
//    @Before (order = 1)

    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");

    }


    @Before (value = "@salesManager")
    public void setupScenarioForSalesLogin() throws InterruptedException {
        String loginUrl = ConfigurationReader.getProperty("translantik.url");
        Driver.getDriver().get(loginUrl);
        translantikLoginPage.inputUsername.
                sendKeys(ConfigurationReader.getProperty("salesManagerUsername"));
        translantikLoginPage.inputPassword.
                sendKeys(ConfigurationReader.getProperty("salesManagerPassword"));
        translantikLoginPage.loginButton.click();

    }

    @Before (value = "@salesManagerFleet")
    public void setupScenarioForSalesFleetLogin() throws InterruptedException {
        String loginUrl = ConfigurationReader.getProperty("translantik.url");
        Driver.getDriver().get(loginUrl);
        translantikLoginPage.inputUsername.
                sendKeys(ConfigurationReader.getProperty("salesManagerUsername"));
        translantikLoginPage.inputPassword.
                sendKeys(ConfigurationReader.getProperty("salesManagerPassword"));
        translantikLoginPage.loginButton.click();
        dashBoardPage.fleetVehicleClick();
    }


    @Before (value = "@truckDriverFleet")
    public void setupScenarioForTruckLogin() throws InterruptedException {
        String loginUrl = ConfigurationReader.getProperty("translantik.url");
        Driver.getDriver().get(loginUrl);
        translantikLoginPage.inputUsername.
                sendKeys(ConfigurationReader.getProperty("TruckDriverUsername"));
        translantikLoginPage.inputPassword.
                sendKeys(ConfigurationReader.getProperty("TruckDriverPassword"));
        translantikLoginPage.loginButton.click();
        dashBoardPage.fleetVehicleClick();

    }

    @Before (value = "@storeManagerFleet")
    public void setupScenarioForStoreLogin() throws InterruptedException {
        String loginUrl = ConfigurationReader.getProperty("translantik.url");
        Driver.getDriver().get(loginUrl);
        translantikLoginPage.inputUsername.
                sendKeys(ConfigurationReader.getProperty("storeManagerUsername"));
        translantikLoginPage.inputPassword.
                sendKeys(ConfigurationReader.getProperty("storeManagerPassword"));
        translantikLoginPage.loginButton.click();
        dashBoardPage.fleetVehicleClick();
    }


    //@Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }




        @After
        public void teardownScenario(Scenario scenario){

            //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


            if (scenario.isFailed()){

                byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());

            }


            //BrowserUtils.sleep(5);
            Driver.closeDriver();

            //System.out.println("====Closing browser using cucumber @After");
            //System.out.println("====Scenario ended/ Take screenshot if failed!");
        }

   // @BeforeStep
    public void setupStep(){
        System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep(){
        System.out.println("--------> applying tearDown using @AfterStep");
    }


}
