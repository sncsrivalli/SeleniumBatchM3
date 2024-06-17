package groupExecution;

import org.testng.annotations.Test;

public class TestClass3 {

	@Test(groups = "sanity")
	public void demo1() {
		System.out.println("TestClass3 - demo1 - sanity");
	}
	
	@Test(groups = "regression")
	public void demo2() {
		System.out.println("TestClass3 - demo2 - regression");
	}
	
	@Test(groups = {"sanity", "regression"})
	public void demo3() {
		System.out.println("TestClass3 - demo3 - sanity and regression");
	}
}
