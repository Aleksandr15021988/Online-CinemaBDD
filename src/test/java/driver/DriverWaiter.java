package driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DriverWaiter {

    private static final int TIME_OUT = 10;

    public static WebElement waitToBeClickable(WebElement element){
        return  new WebDriverWait(DriverSingleton.getDriver(), TIME_OUT)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitToBePresenceOfElementLocated(WebElement element){
        return  new WebDriverWait(DriverSingleton.getDriver(), TIME_OUT)
                .until(ExpectedConditions.visibilityOf(element));
    }
}