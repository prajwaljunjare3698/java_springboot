package timedateAPI;

import java.time.LocalTime;

public class LocalTimePor {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(5, 30, 26);
//		LocalTime t1 = time.minusMinutes(4);
		LocalTime t2 = time.plusMinutes(40);
		
		System.out.println(time);
//		System.out.println(t1);
		System.out.println(t2);
	}
}
