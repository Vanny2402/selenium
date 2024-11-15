package testNgPrioritize;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.GoogleSearchPageObject;

public class Implicitwait {

	static WebDriver driver=new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		seleniumWait();
	}
	
	public static void seleniumWait() throws InterruptedException {
		
		driver.get("https://www.google.com/");
		
		GoogleSearchPageObject obj=new GoogleSearchPageObject(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// wait 10 second before any throw
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		obj.setInsertTextBox("Selenium Automation");
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		searchButton.click();		
		
//		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
	
}
