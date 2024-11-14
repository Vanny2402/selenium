package testNgPrioritize;

import org.testng.annotations.Test;

@Test(groups = {"TestAllgroups"}) // all method auto belong to this
public class TestNgGroupDemo {

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("This is Test1 ");
		
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		System.out.println("This is Test2 ");
		
	}
	
	@Test(groups = {"sanity","regression"})
	public void test3() {
		System.out.println("This is Test3 ");
		
	}
	
	@Test
	public void test4() {
		System.out.println("This is Test4 ");
		
	}
}
