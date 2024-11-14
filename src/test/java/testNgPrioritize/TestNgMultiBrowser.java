package testNgPrioritize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgMultiBrowser {

	WebDriver driver =null; 
	@Parameters("browsername") // this case will apply by xml file
	@BeforeTest
	public void setUp(String browsername) {
		System.out.println("browser name: "+browsername);
		System.out.println("thread id: "+ Thread.currentThread().getId());
		
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();

		}else {
			driver= new InternetExplorerDriver();
		}
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed!");
	}
	
	
}
