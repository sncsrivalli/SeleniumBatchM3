package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteFlipkartMobilePricesToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> mobileNames = driver.findElements(By.className("KzDlHZ"));
		
		FileInputStream fis = new FileInputStream("./src/test/resources/testData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet2");
		
		for (int i = 0; i < mobileNames.size(); i++) {
			sh.createRow(i).createCell(0).setCellValue(mobileNames.get(i).getText());
			String price = driver.findElement(By.xpath("//div[text()='"
			                +mobileNames.get(i).getText()+
			   "']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"))
					.getText();
			sh.getRow(i).createCell(1).setCellValue(price);
			
			System.out.println(mobileNames.get(i).getText()+"\t\t"+price);
		}
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/testData1.xlsx");
		wb.write(fos);
		
		wb.close();
		
		driver.quit();
	}

}
