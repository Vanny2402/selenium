package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {
	public static String browser = null;
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		PropertiesFile.getProperty();
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else {
			driver = new InternetExplorerDriver();
		}
	}

	
	@Test(dataProvider = "tst1data")
	public void test1(String username, String password) throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(2000);
		
	}

	@DataProvider(name = "tst1data")
	public Object[][] getData() throws Exception {
		String projectpath = System.getProperty("user.dir");
		Object data[][] = testData(projectpath + "/Excel/data.xlsx", "sheet1");
		return data;

	}

	public Object[][] testData(String excelPath, String sheetName) throws Exception {
		ExcelUtil ex = new ExcelUtil(excelPath, sheetName);
		int rowCount = ex.getRowCount();
		double columCount = ex.getColCount();

		Object data[][] = new Object[rowCount - 1][(int) columCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < columCount; j++) {
				String C_data = ex.getCellDataString(i, j);
				data[i - 1][j] = C_data;
			}
		}
		return data;
	}
}
