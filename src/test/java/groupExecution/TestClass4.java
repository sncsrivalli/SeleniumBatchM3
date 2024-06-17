package groupExecution;

import org.testng.annotations.Test;

public class TestClass4 {

	@Test(groups = {"smoke", "sanity", "regression"})
	public void demo1() {
		System.out.println("TestClass4 - demo1 - smoke, sanity and regression");;
	}
	
	@Test
	public void demo2() {
		System.out.println("TestClass4 - demo2 - no groups");
	}
}
