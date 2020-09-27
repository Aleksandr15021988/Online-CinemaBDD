package steps;

import cucumber.api.java.en.And;
import driver.DriverSingleton;
import page.AfishaPage;

public class AfishaPageSteps {
    AfishaPage afishaPage = new AfishaPage(DriverSingleton.getDriver());

    @And("^I click '(.*)' on Afisha Page$")
    public void iClickOnAfishaPage(String button) {
        afishaPage.clickOnButton(button);
    }
}
