package crossBrowserParallel;

import org.testng.annotations.Test;

public class TestClass2 extends BaseClass {

	@Test
	public void swiggyTest() throws InterruptedException {
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
	}
}
