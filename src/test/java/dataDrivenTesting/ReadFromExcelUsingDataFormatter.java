package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelUsingDataFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter df = new DataFormatter();
		Cell c = wb.getSheet("Sheet1").getRow(4).getCell(1);
		String time = df.formatCellValue(c);
		System.out.println(time);
		
		wb.close();
	}

}
