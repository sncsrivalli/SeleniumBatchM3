package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelMethodChaining {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		double time = wb.getSheet("Sheet1").getRow(4).getCell(1).getNumericCellValue();
		System.out.println(time);
		
		wb.close();
	}

}
