package bootcamp.pretest.qstwo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	private static SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss.SSSZ");
	

	
	public static Date parseDate(String dateString) throws ParseException {
		return dateFormat.parse(dateString);
	}
	
	public static Date parseDateWithTime(String dateTimeString) throws ParseException {
		String dateString = dateTimeString.split("T")[0]; 
		return dateFormat.parse(dateString);
	}
	
//	public static void main(String[] args) {
//		System.out.println(dateFormat2.format(new Date()));;
//	}
}
