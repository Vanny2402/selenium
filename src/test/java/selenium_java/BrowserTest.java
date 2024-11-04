package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException{
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		WebElement textbox= driver.findElement(By.id("APjFqb"));
		textbox.sendKeys("Automation testing");
		
		Thread.sleep(3500);
		
		
		driver.close();
		
//		String prjectPath=System.getProperty("user.dir");
//		System.out.println("Project Path: "+prjectPath);
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.selenium.dev/");
//		Thread.sleep(2000);
//		driver.quit();
	}
}
