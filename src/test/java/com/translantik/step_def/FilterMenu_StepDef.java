package com.translantik.step_def;

import com.translantik.pages.DashBoardPage;
import com.translantik.pages.GridPage;
import com.translantik.pages.TranslantikLoginPage;
import com.translantik.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FilterMenu_StepDef {

    TranslantikLoginPage translantikLoginPage=new TranslantikLoginPage();
    GridPage gridPage=new GridPage();
    @Given("The user logged in as {string}")
    public void theUserLoggedInAs(String userType) {
        new TranslantikLoginPage().loggedAs(userType);
    }

    @When("The user navigates to {string} {string}")
    public void theUserNavigatesTo(String tab, String module) {
        BrowserUtils.waitFor(3);
        DashBoardPage dashboardPage = new DashBoardPage();
        dashboardPage.navigateTo(tab, module);
    }

    @And("The user clicks on filterIcon")
    public void theUserClicksOnFilterIcon() {
        gridPage.waitUntilLoaderScreenDisappear();//Added By @CharlieAlfa
        BrowserUtils.waitForClickablility(gridPage.filterIcon, 10);
        gridPage.filterIcon.click();
    }

    @Then("The user should see Manage Filter button became visible")
    public void theUserShouldSeeManageFilterButtonBecameVisible() {
        Assert.assertTrue("Verify Manage Filter button became visible", gridPage.manageFilterButton.isDisplayed());
    }

}
