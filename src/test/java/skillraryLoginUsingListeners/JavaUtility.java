package skillraryLoginUsingListeners;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility {

	public long convertStringToLong(String data) {
		return Long.parseLong(data);
	}
	
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		return sdf.format(date);
	}
}
