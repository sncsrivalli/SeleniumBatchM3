package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void suiteSetup() {
		Reporter.log("@BeforeSuite", true);
	}
	
	@BeforeTest
	public void testSetup() {
		Reporter.log("@BeforeTest", true);
	}
	
	@BeforeClass
	public void classSetup() {
		Reporter.log("@BeforeClass", true);
	}
	
	@BeforeMethod
	public void methodSetup() {
		Reporter.log("@BeforeMethod", true);
	}
	
	@AfterMethod
	public void methodTeardown() {
		Reporter.log("@AfterMethod", true);
	}
	
	@AfterClass
	public void classTeardown() {
		Reporter.log("@AfterClass", true);
	}
	
	@AfterTest
	public void testTeardown() {
		Reporter.log("@AfterTest", true);
	}
	
	@AfterSuite
	public void suiteTeardown() {
		Reporter.log("@AfterSuite", true);
	}
}
