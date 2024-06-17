package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	@Test(dependsOnMethods = "demo3", alwaysRun = true)
	public void demo1() {
		Reporter.log("Apply For Job", true);
	}
	
	@Test
	public void demo2() {
		//Assert.fail();
		Reporter.log("Register to Naukri", true);
	}
	
	@Test(dependsOnMethods = "demo2", alwaysRun = true)
	public void demo3() {
		Reporter.log("Login to Naukri", true);
	}
}
