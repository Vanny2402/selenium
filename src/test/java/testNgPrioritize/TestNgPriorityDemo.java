package testNgPrioritize;

import org.testng.annotations.Test;

public class TestNgPriorityDemo {

	@Test(priority = 2)
	public void test1() {
		System.out.println("I am inside the Test1");
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("I am inside the Test2");

	}
	@Test(priority = 1)
	public void test3() {
		System.out.println("I am inside the Test3");

	}
}
