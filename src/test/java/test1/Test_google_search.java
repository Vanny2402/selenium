package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test_google_search {
	public static void main(String[] args) throws InterruptedException {
		google_Search();
		
	}

	
	public static void google_Search() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//go to google.come
		driver.get("https://www.google.com/");
		
		//enter text in the search box
		WebElement n=driver.findElement(By.name("q"));
		n.sendKeys("Test Automation Step by Step");		
		
		//Click on search button
	     WebElement searchbtn=driver.findElement(By.name("btnK"));
	     String name=searchbtn.getAttribute("value");
	     System.out.println("this is my value "+ name +"  hmm");
	  	 searchbtn.click();
	     Thread.sleep(2000);
	     //Close the browser
		driver.close();
		
	
	}

}
