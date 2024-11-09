package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.waitelement;


public class TestNg_Demo2 {
	WebDriver driver =null;
	
	@BeforeTest
	public void setUpTest() {
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
        driver=new ChromeDriver();
	}
	
	@Test
	public void google_Search20() throws InterruptedException {
		driver.get("https://www.google.com/");
		WebElement n=driver.findElement(By.name("q"));
		n.sendKeys("Test Automation Step by Step");		
		
		//Click on search button
	     WebElement searchbtn=driver.findElement(By.name("btnK"));
	     waitelement.waitForElementToBeClickable(driver,By.name("btnK"));
	  	 searchbtn.click();
	     Thread.sleep(2000);		
	}
	@Test
	public void google_Search3() throws InterruptedException {
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
