package skillraryLoginUsingListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite Execution Started");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+ " executes");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+ " Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		BaseClass.sdriverUtil.takeScreenshot(BaseClass.sdriver, 
				BaseClass.sjutil, result.getMethod().getMethodName());
		System.out.println(result.getMethod().getMethodName()
				+ " Fail"+"\t"+ result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+ " Skipped"+"\t"
							+ result.getThrowable());

	}

	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite Execution Finished");
	}

}
