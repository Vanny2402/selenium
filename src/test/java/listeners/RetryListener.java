package listeners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testNgPrioritize.RetryAnalyzer;

public class RetryListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        // Check if RetryAnalyzer is attached to the test, if not attach it
        if (result.getMethod().getRetryAnalyzer(result) == null) {
            result.getMethod().setRetryAnalyzerClass(RetryAnalyzer.class);
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {}
    @Override
    public void onTestSkipped(ITestResult result) {}
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    @Override
    public void onStart(ITestContext context) {}
    @Override
    public void onFinish(ITestContext context) {}
}
