package skillraryLoginUsingListeners;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	protected WebDriver driver;
	
	protected DriverUtility driverUtil;
	protected FileUtility file;
	protected JavaUtility jutil;
	
	protected SkillraryDemoAppLoginPage login;
	
	public static WebDriver sdriver;
	public static JavaUtility sjutil;
	public static DriverUtility sdriverUtil;
	
	@BeforeClass
	public void classSetup() {
		driverUtil = new DriverUtility();
		file = new FileUtility();
		jutil = new JavaUtility();
		
		file.propertiesInit();

		driver = driverUtil.launchBrowser(file.readFromProperties("browser"));
		driverUtil.maximizeBrowser();
		driverUtil.waitTillElementFound(jutil
				.convertStringToLong(file.readFromProperties("timeouts")));

		sdriver = driver; 
		sjutil = jutil;
		sdriverUtil = driverUtil;
	}
	
	@BeforeMethod
	public void methodSetup() {
		driverUtil.navigateToApp(file.readFromProperties("url"));
		login = new SkillraryDemoAppLoginPage(driver);
		login.clickLogin();
	}
	
	@AfterClass
	public void classTeardown() {
		driverUtil.closeBrowser();
	}
}
