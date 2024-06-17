package dataProviders;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripSearchFlightsTest {

	@Test(dataProvider = "data")
	public void searchFlightsTest(String src, String dest) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frame = driver.findElement(By
					.id("webklipper-publisher-widget-container-notification-frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(src);
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(dest);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//div[@aria-label='Mon Jun 10 2024']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		driver.findElement(By.className("overlayCrossIcon")).click();
		
		String headerText = driver.findElement(By.cssSelector("p.whiteText")).getText();
		Assert.assertTrue(headerText.contains(src) && headerText.contains(dest));
		
		driver.quit();
	}
	
	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[3][2];

		obj[0][0] = "Hyderabad";
		obj[0][1] = "Chennai";

		obj[1][0] = "Hyderabad";
		obj[1][1] = "Bangalore";

		obj[2][0] = "Hyderabad";
		obj[2][1] = "Delhi";

		return obj;
	}
}
