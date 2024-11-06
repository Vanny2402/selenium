package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.waitelement;

public class ExtentReportBasic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("comReport.html");
		//create extent report and attach reports 
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		//create a toggle for the given test, adds all logs envents under 
		ExtentTest test1=extent.createTest("Google Search","this is a test to validate google search functionality ");
//        String projectPath = System.getProperty("user.dir");
//        System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
        
        test1.log(Status.INFO,"Starting TestCase");
        driver.get("https://www.google.com/");
        test1.pass("Navigated to Google.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("Entered Text in the search");
        
        waitelement.waitForElementToBeVisible(driver,By.name("btnK"));
        driver.findElement(By.name("btnK")).click();
        test1.pass("clicked Enter");        
        Thread.sleep(3000);
        
        driver.close();
        driver.quit();
        
        
        
    	ExtentTest ss=extent.createTest("Google Search","this is a test to validate google search functionality ");
//      String projectPath = System.getProperty("user.dir");
//      System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
      driver = new ChromeDriver();
      
      ss.log(Status.INFO,"Starting TestCase");
      driver.get("https://www.google.com/");
      ss.pass("Navigated to Google.com");
      
      driver.findElement(By.name("q")).sendKeys("Automation");
      ss.fail("Entered Text in the search");
      
      waitelement.waitForElementToBeVisible(driver,By.name("btnK"));
      driver.findElement(By.name("btnK")).click();
      ss.pass("clicked Enter");        
      Thread.sleep(3000);
      
      driver.close();
      driver.quit();
      ss.pass("Test completed!");
        
        
      extent.flush();
		
	}
}
