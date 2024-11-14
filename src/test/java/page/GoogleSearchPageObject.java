package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	WebDriver driver = null;
	By textbox_Search = By.id("APjFqb");
	By button_Search = By.name("btnK");	
	
	public GoogleSearchPageObject(WebDriver driver) {
	
		this.driver=driver;
	}
	
	public void setInsertTextBox(String text) {
		driver.findElement(textbox_Search).sendKeys(text,Keys.RETURN);
		
	}
//	public void clickButtonSearch() {
//		driver.findElement(button_Search).click();
//	}
}
