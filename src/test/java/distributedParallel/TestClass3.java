package distributedParallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass3 {

	@Test
	public void demo1() {
		Reporter.log("TestClass3 - demo1", true);
	}
	
	@Test
	public void demo2() {
		Reporter.log("TestClass3 - demo2", true);
	}
}
