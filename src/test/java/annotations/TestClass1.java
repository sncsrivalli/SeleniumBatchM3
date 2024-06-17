package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {

	@Test
	public void demo() {
		Reporter.log("TestClass1 - @Test", true);
	}
}
