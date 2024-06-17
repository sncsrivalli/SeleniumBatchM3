package retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(retryAnalyzer = retryAnalyzer.RetryImplementation.class)
	public void test2() {
		System.out.println("test2");
		Assert.fail();
	}
}
