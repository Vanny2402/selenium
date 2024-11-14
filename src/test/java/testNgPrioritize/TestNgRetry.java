package testNgPrioritize;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listeners.RetryListener.class)
public class TestNgRetry {

    @Test(retryAnalyzer = testNgPrioritize.RetryAnalyzer.class)
	public void test1() {
		System.out.println("inside the Test1");
	}
	
    @Test(retryAnalyzer = testNgPrioritize.RetryAnalyzer.class)
	public void test2() {
		System.out.println("inside the Test2");
	}
	
    @Test(retryAnalyzer = testNgPrioritize.RetryAnalyzer.class)
	public void test3() {
		System.out.println("inside the Test3");
		Assert.assertTrue(0>1);
	}
}
