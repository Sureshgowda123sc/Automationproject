package generic_Utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Java_Utility {

	public String calendeHandling(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(d);
		return date;

	}

	public int getRandomNumber(int range) {
		Random r = new Random();
		int num = r.nextInt(range);
		return num;

	}

}
