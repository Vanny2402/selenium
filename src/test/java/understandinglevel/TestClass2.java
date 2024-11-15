package understandinglevel;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class TestClass2 extends BaseTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest - Runs once before the <test> block in TestGroup2");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest - Runs once after the <test> block in TestGroup2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass - Runs once before any methods in TestClass2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass - Runs once after all methods in TestClass2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod - Runs before each test method in TestClass2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod - Runs after each test method in TestClass2");
    }

    @Test
    public void testMethod1() {
        System.out.println("TestMethod1 - Test method in TestClass2");
    }
}