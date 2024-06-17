package skillraryLoginUsingListeners;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	private Properties property;
	
	public void propertiesInit() {
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

	public String readFromProperties(String key) {
		return property.getProperty(key);
	}
}
