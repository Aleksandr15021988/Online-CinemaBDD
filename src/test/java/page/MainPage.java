package page;

import driver.DriverWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.HashMap;
import java.util.Map;

public class MainPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='mainmenu']//a[contains(.,'Афиша')]")
    private WebElement btnAfisha;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage (String MainPage) {
        driver.navigate().to(MainPage);
        return this;
    }

    @Override
    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap();
        elements.put("Афиша", btnAfisha);
        return elements.get(NameOfElement);
    }

    public AfishaPage clickOnButton(String nameOfButton){
        DriverWaiter.waitToBeClickable(getWebElement(nameOfButton)).click();
        return new AfishaPage(driver);
    }
}
