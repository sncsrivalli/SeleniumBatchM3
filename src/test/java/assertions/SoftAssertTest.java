package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void demo() {
		String s1 = "hello";
		String s2 = "Hello";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Test Ends Here");
		
		soft.assertAll();
	}
}
