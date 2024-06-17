package distributedParallel;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void demo1() {
		Reporter.log("TestClass2 - demo1", true);
	}
	
	@Test
	public void demo2() {
		Reporter.log("TestClass2 - demo2", true);
	}
}
