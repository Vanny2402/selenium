package testNgPrioritize;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.function.Function;

public class FluentWatiDemo {
    private static WebDriver driver;

    public static void test() {
        driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com/");
        
        // Perform Google search
        driver.findElement(By.name("q")).sendKeys("Abcd", Keys.RETURN);

        // Set up FluentWait with a 30-second timeout and 5-second polling interval
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        // Wait for the specific link to be clickable
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement ele = driver.findElement(By.xpath("//h3[contains(text(),'ABC Song')]"));
                if (ele.isEnabled()) {
                    System.out.println("Element found and is enabled.");
                    return ele;
                } else {
                    System.out.println("Waiting for element to be enabled...");
                    return null; // Return null to keep waiting
                }
            }
        });
        
        // Click the found element
        foo.click();

        // Close and quit the driver
        driver.close();
        driver.quit();
    }
    
    public static void main(String[] args) {
        test();
    }
}
