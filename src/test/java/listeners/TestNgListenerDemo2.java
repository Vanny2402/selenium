package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNgListenerDemo2 {

	@Test
	public void Test4() {
		System.out.println("This is Test4 ");
	}
	
	@Test
	public void Test5() {
		System.out.println("This is Test5 ");
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void Test6() {
		System.out.println("This is Test6 ");
		throw new SkipException("This is Skipe");
	}
}
