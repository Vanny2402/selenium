package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgLestener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("***************Test Start****************"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("***************Test Succesfull****************"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("***************Test Failed****************"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("***************Test Skipped****************"+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("***************Test Completed****************"+context.getName());

	}	
}
