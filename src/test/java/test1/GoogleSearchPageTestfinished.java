
package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.GoogleSearchPageObject;
import utility.waitelement;

public class GoogleSearchPageTestfinished {

	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
	}
	
	public static void googleSearchTest() throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        GoogleSearchPageObject searchpage= new GoogleSearchPageObject(driver);
        searchpage.setInsertTextBox("My first text!");
        waitelement.waitForElementToBeClickable(driver, By.name("btnK"));
        searchpage.clickButtonSearch();
        Thread.sleep(5000);
        driver.close();
        
	}
}
