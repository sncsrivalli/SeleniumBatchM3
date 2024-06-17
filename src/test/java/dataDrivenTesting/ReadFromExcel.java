package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/testData1.xlsx");
		
		// Step 2: Open Workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		// Step 3: Go to specific sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		// Step 4: Go to specific Row
		Row r = sh.getRow(1);
		
		// Step 5: Go to specific cell
		Cell c = r.getCell(1);
		
		// Step 6: Fetch data
		System.out.println(c.getStringCellValue());
		
		// Step 7: Close Excel
		wb.close();
	}

}
