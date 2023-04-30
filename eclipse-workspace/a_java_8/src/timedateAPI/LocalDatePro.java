package timedateAPI;

import java.time.LocalDate;

public class LocalDatePro {
	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		LocalDate yesterday = date.minusDays(1);
//		LocalDate tommo = date.plusDays(1);
//		
//		System.out.println(date);
//		System.out.println(yesterday);
//		System.out.println(tommo);
		
//		LocalDate date = LocalDate.of(2016,2, 17);
//	    LocalDate date2 = LocalDate.of(2014, 9, 23);    
//	    System.out.println(date.isLeapYear());    
//	    System.out.println(date2.isLeapYear());  
	    
		String dInStr = "2011-09-01";  //(only this format not anything)
//		String dInStr = "2011/09/01"; //exception  
        LocalDate d1 = LocalDate.parse(dInStr);  
        System.out.println("String to LocalDate : " + d1);  
	    
	}
}
