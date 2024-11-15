package understandinglevel;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	
    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("BeforeSuite - Runs once before any test in the suite");
    }

    @AfterSuite
    public static void afterSuite() {
        System.out.println("AfterSuite - Runs once after all tests in the suite");
    }
}
