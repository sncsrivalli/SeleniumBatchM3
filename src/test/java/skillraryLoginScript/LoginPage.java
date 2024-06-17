package skillraryLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Declaration
	@FindBy(id = "email")
	private WebElement usernameTF;

	@FindBy(id = "password")
	private WebElement passwordTF;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCB;

	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement forgotPWDLink;

	@FindBy(id = "last")
	private WebElement loginBTN;

	// Initialization
	public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	// Utilization
	public void setUsername(String username) {
		usernameTF.sendKeys(username);
	}

	public void setPassword(String pwd) {
		passwordTF.sendKeys(pwd);
	}

	public void clickKeepMeLoggedInCB() {
		keepMeLoggedInCB.click();
	}

	public void clickForgotPWDLink() {
		forgotPWDLink.click();
	}

	public void clickLoginBTN() {
		loginBTN.click();
	}
}
