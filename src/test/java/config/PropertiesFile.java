package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test1.ExtentReportTestNg;
import test1.TestNg_Demo;
import utility.ExcelDataProvider;

public class PropertiesFile {
	static Properties properties=new Properties();
	static String path=System.getProperty("user.dir");
	public static void main(String[] args) throws IOException {
		getProperty();
		setProperty();
	}

	public static void getProperty() {

		try {
			// Load the properties file
			InputStream input = new FileInputStream(path +"/src/test/java/config/config.properties");
			properties.load(input);
			// Get properties
			String browser = properties.getProperty("Browser");
			// Use properties
			System.out.println("Database URL: " + browser);
			
			ExtentReportTestNg.browser=browser;
			ExcelDataProvider.browser=browser;
			TestNg_Demo.browser=browser;
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void setProperty() throws IOException {
		OutputStream output=new FileOutputStream(path +"/src/test/java/config/config.properties");
		properties.setProperty("Browser", "firefox");
		properties.store(output, null);
	}
}
