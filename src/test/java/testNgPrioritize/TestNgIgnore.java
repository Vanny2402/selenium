package testNgPrioritize;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestNgIgnore {

	@Test
	@Ignore
	public void test1() {
		System.out.println("Inside the test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Inside the test2");
	}
}
