package assertions;

import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void demo() {
		String s1 = "hello";
		String s2 = "Hello";
		
		if(s1.equals(s2))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
