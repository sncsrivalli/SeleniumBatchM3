package skillraryLoginUsingListeners;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	@Test(dataProvider = "credentials")
	public void loginTest(String username, String password) {
		login.setUsername(username);
		login.setPassword(password);
		login.clickKeepMeLoggedInCB();
		login.clickLoginBTN();

		Assert.assertTrue(login.adminPageHeaderIsDisplayed());
	}
	
	@DataProvider
	public Object[][] credentials() {
		Object[][] obj = new Object[2][2];
		obj[0][0] = "admin123";
		obj[0][1] = "12345";
		
		obj[1][0] = "admin";
		obj[1][1] = "admin";
		
		return obj;
	}
}
