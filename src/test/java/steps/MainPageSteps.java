package steps;

import constants.URL_Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import driver.DriverSingleton;
import page.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage(DriverSingleton.getDriver());

    @Given("^I open '(.*)' on portal")
    public void iOpenPageOnPortal(String pageName) {
        mainPage.openPage(URL_Constants.getURL(pageName));
    }

    @When("^I click '(.*)' on Main Page$")
    public void iClickOnMainPage(String button) {
        mainPage.clickOnButton(button);
    }


}
