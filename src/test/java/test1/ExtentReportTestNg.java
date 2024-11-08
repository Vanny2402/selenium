package test1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import page.GoogleSearchPageObject;


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
		
	    // Navigate to Google
	    driver.get("https://www.google.com/");
	    ExtentTest test = extent.createTest("My first Test!", "My Description");
	    GoogleSearchPageObject searchPage = new GoogleSearchPageObject(driver);
	    searchPage.setInsertTextBox("My first Hash!");
	    
	    
	    Thread.sleep(2000);  // For demonstration; prefer explicit waits
	    
	    // Capture and save screenshot
	    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String screenshotPath = "Screenshot_.png";
	    Path destinationPath = Paths.get(screenshotPath);
	    Files.copy(srcFile.toPath(), destinationPath,StandardCopyOption.REPLACE_EXISTING);

	    // Add screenshot to report
	    test.addScreenCaptureFromPath(screenshotPath);
	    
	    // Mark the test as passed
	    test.pass("Screenshot captured successfully.");
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
