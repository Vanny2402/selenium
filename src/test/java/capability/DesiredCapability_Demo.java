
package capability;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import page.GoogleSearchPageObject;

public class DesiredCapability_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start the Test!");
		DesiredCapabilities caps=new DesiredCapabilities();
		//any setting here 
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		WebDriver driver = new InternetExplorerDriver();
	    driver.get("https://www.google.com/");
	    GoogleSearchPageObject gg= new GoogleSearchPageObject(driver);
	    
	    gg.setInsertTextBox("Desired capability!");
	    
	    Thread.sleep(2000);
	    driver.quit();	    
	    
	    System.out.print("End");
	}
}
