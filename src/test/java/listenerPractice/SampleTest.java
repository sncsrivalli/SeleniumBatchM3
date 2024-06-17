package listenerPractice;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPractice.ListenerImplementation.class)
public class SampleTest extends BaseClass {

	@Test
	public void test1() {
		Reporter.log("Hello World!", true);
	}
}
