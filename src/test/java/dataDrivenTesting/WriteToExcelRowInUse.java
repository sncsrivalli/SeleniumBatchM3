package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcelRowInUse {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/testData1.xlsx");

		// Step 2: Open Workbook
		Workbook wb = WorkbookFactory.create(fis);

		// Step 3: Go to specific sheet
		Sheet sh = wb.getSheet("Sheet1");

		// Step 4: Get Row
		Row r = sh.getRow(5);

		// Step 5: Create Cell
		Cell c = r.createCell(1);

		// Step 6: Write data
		c.setCellValue("Automation");

		// Step 7: Save data to Excel
		FileOutputStream fos = new FileOutputStream("./src/test/resources/testData1.xlsx");
		wb.write(fos);

		// Step 8: Close Excel
		wb.close();
	}

}
