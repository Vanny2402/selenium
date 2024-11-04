package utility;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitelement {

    // Static method to create a WebDriverWait instance
    public static WebDriverWait createWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebElement waitForElementToBeVisible(WebDriver driver, By locator) {
        WebDriverWait wait = createWait(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForElementToBeClickable(WebDriver driver, By locator) {
        WebDriverWait wait = createWait(driver);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForPresenceOfElement(WebDriver driver, By locator) {
        WebDriverWait wait = createWait(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}