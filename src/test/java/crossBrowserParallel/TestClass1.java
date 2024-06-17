package crossBrowserParallel;

import org.testng.annotations.Test;

public class TestClass1 extends BaseClass {
	
	@Test
	public void googleTest() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
}
