package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.*;

@Listeners(listeners.TestNgLestener.class)
public class TestNgListenerDemo {
	WebDriver driver= null;
	
	
	@Test
	public void Test1() {
		System.out.println("This is Test1 ");
	}
	
	@Test
	public void Test2() throws InterruptedException {
		System.out.println("This is Test2 ");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
        GoogleSearchPageObject searchpage= new GoogleSearchPageObject(driver);
        
        searchpage.setInsertTextBox("Testing selenium");
		
        Thread.sleep(2000);
        driver.close();
        driver.quit();
	}
	
	
	@Test
	public void Test3() {
		System.out.println("This is Test3 ");
		throw new SkipException("This is Skipe");
	}
}
