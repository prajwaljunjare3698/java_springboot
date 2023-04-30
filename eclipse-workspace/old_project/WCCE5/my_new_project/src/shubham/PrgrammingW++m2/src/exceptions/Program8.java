package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program8 {
public static void main(String[] args) {
	
	try
	{
	
	FileReader f = new FileReader("abc.txt");
	}
	catch (FileNotFoundException e) 
	{
		
	System.out.println("File not found");
	}
	finally 
	{
		System.out.println(" Hi file");
		
	}
}
}
