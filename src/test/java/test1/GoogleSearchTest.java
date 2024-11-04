package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.GoogleSearchPage;

import java.time.Duration;

public class GoogleSearchTest {
    private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {
        google_Search();
    }

    public static void google_Search() throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // Find the search box and enter text
        GoogleSearchPage.text_box_search(driver).sendKeys("Happy Learning");

        // Wait for the search button to be clickable and then click it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = GoogleSearchPage.btn_search(driver);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();

        // Optional: Wait for results to load (you can customize this further)
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search"))); // Wait for search results to be present
        
        driver.close();
    }
}
