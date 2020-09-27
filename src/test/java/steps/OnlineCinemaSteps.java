package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import driver.DriverSingleton;
import driver.DriverWaiter;
import org.testng.Assert;
import page.OnlineCinemaPage;

public class OnlineCinemaSteps {
    OnlineCinemaPage onlineCinemaPage = new OnlineCinemaPage(DriverSingleton.getDriver());

    @And("^I choose '(.*)' in '(.*)' dropdown on Online Cinema page$")
    public void iSelectValueFromDropdown(String value, String dropdown) {
        onlineCinemaPage.clickElement(dropdown);
        onlineCinemaPage.clickElement(value);
    }

    @Then("^I verify that all choosen genre are '(.*)'$")
    public void VerifyAllChoosenFilms(String expectedValue) {
        for (int i = 0; i < onlineCinemaPage.getGanriesList().size(); i++) {
            DriverWaiter.waitToBePresenceOfElementLocated(onlineCinemaPage.getGanriesList().get(i));
            Assert.assertTrue(onlineCinemaPage.getGanriesList().get(i).getText().contains(expectedValue));
        }
    }

    @And("^I click button '(.*)' on Online Cinema page$")
    public void iClickButtonOnOnlineCinemaPage(String nameOfButton) {
        onlineCinemaPage.clickElement(nameOfButton);
    }
}
