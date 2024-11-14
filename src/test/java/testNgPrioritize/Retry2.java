package testNgPrioritize;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.RetryListener.class)
public class Retry2 {
	   private static int attempt = 0;

	    @Test(retryAnalyzer = testNgPrioritize.RetryAnalyzer.class)
	    public void testThatFailsInitially() {
	        attempt++;
	        System.out.println("Attempt #" + attempt);
	        // This test will fail on the first attempt and pass on the second attempt
	        if (attempt < 2) {
	            Assert.fail("Failing the test on attempt #" + attempt);
	        }
	    }

	    @Test(retryAnalyzer = testNgPrioritize.RetryAnalyzer.class)
	    public void testThatAlwaysFails() {
	        System.out.println("This test always fails");
	        Assert.fail("This test fails on every attempt");
	    }
}
