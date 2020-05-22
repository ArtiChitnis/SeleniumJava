package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("*********** Test Started" +result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*********** Test Sucessful" +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*********** Test failed" +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*********** Test skipped" +result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*********** Test Success percentage " +result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("*********** Test Failed with timeout" +result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		System.out.println("*********** Test completed" +context.getName());
	}


}
