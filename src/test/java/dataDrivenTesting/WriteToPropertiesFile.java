package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		Properties property = new Properties();
		property.load(fis);
		
		property.put("user2", "ABC");
		property.put("pwd2", "123");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos, "Updated Successfully");
		
		System.out.println("Execution done");

	}

}
