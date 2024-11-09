package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import utility.waitelement;


public class TestNg_Demo {
	WebDriver driver =null;
	public static String browser =null;
	PropertiesFile ds =new PropertiesFile();
	
	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getProperty();
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else {
			driver=new InternetExplorerDriver();
		}
	}
	
	@Test
	public void google_Search() throws InterruptedException {
		driver.get("https://www.google.com/");
		WebElement n=driver.findElement(By.name("q"));
		n.sendKeys("Test Automation Step by Step");		
		
		//Click on search button
	     WebElement searchbtn=driver.findElement(By.name("btnK"));
	     waitelement.waitForElementToBeClickable(driver,By.name("btnK"));
	  	 searchbtn.click();
	     Thread.sleep(2000);		
	}
	
	@AfterTest
	public void tearDownTest() {
        waitelement.waitForPresenceOfElement(driver, By.id("APjFqb"));
		driver.close();
		driver.quit();
		System.out.println("Finihed the testing");
	}

}
