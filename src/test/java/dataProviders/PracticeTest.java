package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeTest {

	@Test(dataProvider = "data")
	public void bookTicketTest(String src, String dest) {
		System.out.println("From: " + src + "\tTo: " + dest);
	}

	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[3][2];

		obj[0][0] = "Hyd";
		obj[0][1] = "Chennai";

		obj[1][0] = "Hyd";
		obj[1][1] = "Bangalore";

		obj[2][0] = "Hyd";
		obj[2][1] = "Delhi";

		return obj;
	}
}
