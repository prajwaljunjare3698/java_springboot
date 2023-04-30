package com.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePro {
	public static void main(String[] args) {    
	   //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");  
	   LocalDateTime now = LocalDateTime.now(); 
	   System.out.println(now.get(null));  
	}    
}
