package test1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import page.GoogleSearchPageObject;
import utility.waitelement;

public class ExtentReportTestNg {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver=null;
	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("comReport.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
        driver = new ChromeDriver();
	}
	

	@Test
	public void test1() throws Exception {
				
		ExtentTest test=extent.createTest("My first Test !","My Description");
		driver.get("https://www.google.com/");
		
		
        GoogleSearchPageObject searchpage= new GoogleSearchPageObject(driver);
        searchpage.setInsertTextBox("My first text!");
        waitelement.waitForElementToBeClickable(driver, By.name("btnK"));
        searchpage.clickButtonSearch();
        Thread.sleep(2000);
		test.addScreenCaptureFromPath("Screenshort.png");

        
//		test.log(Status.INFO,"This step is purpose to show the logs!");
//		test.info("This step is to show detail!");
//		test.fail("Details",MediaEntityBuilder.createScreenCaptureFromPath("Screenshort.png").build());
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Quit the browser!");
	}
	@AfterSuite
	public void tearDown() {
		
		extent.flush();
	}
}
