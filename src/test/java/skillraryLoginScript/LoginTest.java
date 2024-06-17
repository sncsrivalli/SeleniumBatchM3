package skillraryLoginScript;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

	@Test
	public void skillraryLoginTest() {
		login.setUsername(file.read("username"));
		login.setPassword(file.read("password"));
		login.clickKeepMeLoggedInCB();
		login.clickLoginBTN();
	}
}
