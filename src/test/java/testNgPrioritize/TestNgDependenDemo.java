package testNgPrioritize;

import org.testng.annotations.Test;

public class TestNgDependenDemo {

	@Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println("Inside the Test1");
	}
	
	@Test()
	public void test2() {
		System.out.println("Inside the Test2");
	}
	
	@Test()
	public void test3() {
		System.out.println("Inside the Test3");
	}
}
