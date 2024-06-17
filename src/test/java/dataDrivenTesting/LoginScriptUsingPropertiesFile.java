package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScriptUsingPropertiesFile {

	Properties property;
	
	public static void main(String[] args) throws InterruptedException {
		LoginScriptUsingPropertiesFile login = new LoginScriptUsingPropertiesFile();
		login.initializeProperties();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(login.read("url"));
		
		long time = Long.parseLong(login.read("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("email")).sendKeys(login.read("username"));
		driver.findElement(By.id("password")).sendKeys(login.read("password"));
		driver.findElement(By.id("last")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	public void initializeProperties() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/data.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String read(String key) {
		return property.getProperty(key);
	}

}
