
package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.GoogleSearchPageObject;

public class GoogleSearchPageTestfinished {

	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
	}
	
	public static void googleSearchTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        GoogleSearchPageObject searchpage= new GoogleSearchPageObject(driver);
        searchpage.setInsertTextBox("My first text!");
        Thread.sleep(5000);
        driver.close();
        
	}
}
