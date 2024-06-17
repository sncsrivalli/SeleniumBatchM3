package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {

	@Test
	public void demo() {
		String s1 = "hello";
		String s2 = "Hello";
		
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Test Ends Here");
	}
}
