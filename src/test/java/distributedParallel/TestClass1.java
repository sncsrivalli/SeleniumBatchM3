package distributedParallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void demo1() {
		Reporter.log("TestClass1 - demo1", true);
	}
	
	@Test
	public void demo2() {
		Reporter.log("TestClass1 - demo2", true);
	}
}
