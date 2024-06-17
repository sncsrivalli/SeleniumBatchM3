package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillraryLoginUsingPropertiesTest {

	public static void main(String[] args) throws InterruptedException {
		FileUtility file = new FileUtility();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(file.readFromProperties("url"));
		
		long time = Long.parseLong(file.readFromProperties("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		SkillraryDemoAppLoginPage login = new SkillraryDemoAppLoginPage(driver);
		
		login.setUsername(file.readFromProperties("username"));
		login.setPassword(file.readFromProperties("password"));
		login.clickKeepMeLoggedInCB();
		login.clickLoginBTN();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
