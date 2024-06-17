package skillraryLoginScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver driver;
	protected LoginPage login;
	protected FileUtility file;
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void methodConfig() {
		file = new FileUtility();
		file.propertyInit();
		
		driver.get(file.read("url"));
		long time = Long.parseLong(file.read("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		login = new LoginPage(driver);
	}
	
	@AfterMethod
	public void methodTeardown() {
		System.out.println("Login Test Completed");
	}
	
	@AfterClass
	public void classTeardown() {
		driver.quit();
	}
	
	//@AfterTest
	//@AfterSuite
}
