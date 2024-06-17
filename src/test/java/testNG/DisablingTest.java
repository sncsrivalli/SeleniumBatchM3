package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisablingTest {

	@Test
	public void demo1() {
		Reporter.log("demo1", true);
	}
	
	@Test(enabled = false)
	public void demo2() {
		Reporter.log("demo2", true);
	}
	
	@Test(invocationCount = 0)
	public void demo3() {
		Reporter.log("demo3", true);
	}
}
