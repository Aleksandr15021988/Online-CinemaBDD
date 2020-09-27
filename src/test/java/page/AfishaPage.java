package page;

import driver.DriverWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.HashMap;
import java.util.Map;

public class AfishaPage extends AbstractPage {
    @FindBy(xpath = "//a[contains(.,'Онлайн-кинотеатры')]")
    private WebElement btnOnlineCinema;

    public AfishaPage(WebDriver driver) {
        super(driver);
    }

    public AbstractPage openPage(String pageName) {
        driver.navigate().to(pageName);
        return this;
    }

    public OnlineCinemaPage clickOnButton(String nameOfButton){
       DriverWaiter.waitToBeClickable(getWebElement(nameOfButton)).click();
        return new OnlineCinemaPage(driver);
    }

    @Override
    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap();
        elements.put("Онлайн кинотеатры", btnOnlineCinema);
        return elements.get(NameOfElement);
    }
}
