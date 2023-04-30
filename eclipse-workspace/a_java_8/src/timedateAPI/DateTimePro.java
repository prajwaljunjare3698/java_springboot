package timedateAPI;

import java.time.LocalDateTime;
import java.util.Date;

public class DateTimePro {
	public static void main(String[] args) {
		LocalDateTime t = LocalDateTime.now();
		System.out.println(t);
		
		Date date = new Date();
		System.out.println(date);
		
	}
}
