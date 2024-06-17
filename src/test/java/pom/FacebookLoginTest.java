package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FacebookLoginPage fbLogin = new FacebookLoginPage(driver);
		
		fbLogin.setUsername("465796965465456");
		fbLogin.setPassword("8647564654");
		fbLogin.clickLoginBTN();
		
		Thread.sleep(4000);
		driver.quit();
	}

}
