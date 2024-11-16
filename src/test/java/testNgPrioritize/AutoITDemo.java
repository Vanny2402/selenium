package testNgPrioritize;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {
		WebDriver driver =new ChromeDriver();
//		
//		driver.get("http://the-internet.herokuapp.com/upload");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement uploadButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload")));
//        uploadButton.click();
        
        driver.get("http://the-internet.herokuapp.com/upload");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("file-upload")));
        // Use JavaScript to click the upload button
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", uploadButton);
		Thread.sleep(7000);

        try {
        	
        	 Runtime.getRuntime().exec("D:/Learning/OtherLearn/selenium/AutoITscript/script.exe");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(7000);
		driver.close();
	}
	
}
