package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	// Declaration
	@FindBy(id="email")
	private WebElement usernameTF;
	
	@FindBy(id="pass")
	private WebElement passwordTF;
	
	@FindBy(name="login")
	private WebElement loginBTN;
	
	@FindBy(linkText = "Forgotten password?")
	private WebElement forgotPwdLink;
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createAccountLink;
	
	// Initialization
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Utilization
	
	public void setUsername(String un) {
		usernameTF.sendKeys(un);
	}
	
	public void setPassword(String pwd) {
		passwordTF.sendKeys(pwd);
	}
	
	public void clickLoginBTN() {
		loginBTN.click();
	}
	
	public void clickForgotPWDLink() {
		forgotPwdLink.click();
	}
	
	public void clickCreateAccountLink() {
		createAccountLink.click();
	}
}
