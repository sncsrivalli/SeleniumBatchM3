package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class SampleTest {

	@Test
	public void test1() {
		Reporter.log("Hello World!", true);
	}
}
