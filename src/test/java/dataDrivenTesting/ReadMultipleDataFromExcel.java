package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			list.add(df.formatCellValue(sh.getRow(i).getCell(1)));
		}
		
		System.out.println(list);
		
		wb.close();
	}

}
