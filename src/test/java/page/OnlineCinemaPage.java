package page;

import driver.DriverWaiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineCinemaPage extends AbstractPage {
    @FindBy(xpath = "//button[contains(.,'Жанры')]")
    private WebElement ddlGanries;

    @FindBy(xpath = "//a[contains(.,'Комедия')]")
    private List <WebElement> valueComedy;

    @FindBy(xpath = "//p[contains(.,'Комедия')]")
    private List <WebElement> txtGanries;

    @FindBy(xpath = "//a[contains(.,'Сериалы')]")
    private WebElement btnSeries;

    @FindBy(xpath = "//a[contains(.,'Мультфильмы')]")
    private WebElement btnCartoons;

    public OnlineCinemaPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected AbstractPage openPage(String pageName) {
        driver.navigate().to(pageName);
        return this;
    }

    @Override
    public WebElement getWebElement(String NameOfElement) {
        Map<String, WebElement> elements = new HashMap();
        elements.put("Жанр", ddlGanries);
        elements.put("Комедия из вкладки фильмы",valueComedy.get(0));
        elements.put("Сериалы", btnSeries);
        elements.put("Комедия из вкладки сериалы", valueComedy.get(1));
        elements.put("Мультфильмы", btnCartoons);
        elements.put("Комедия из вкладки мультфильмы", valueComedy.get(2));
        return elements.get(NameOfElement);
    }

    public List<WebElement> getGanriesList() {
        return txtGanries;
    }

    public void clickElement(String NameOfElement){
        DriverWaiter.waitToBePresenceOfElementLocated(getWebElement(NameOfElement)).click();
    }

    public void selectValueFromDropDown(String dropdown,String dropdownValue){
        Select select =new Select(getWebElement(dropdown));
        select.selectByValue(dropdownValue);
    }
}
