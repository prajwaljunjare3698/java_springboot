package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program11 {
	
	void readData() throws FileNotFoundException
	{
		FileReader f = new FileReader("123.txt");
	}
	public static void main(String[] args) {
		
		Program11 p = new Program11();
	    try
		{
		p.readData();
		}
		catch (FileNotFoundException e)
		{
		System.out.println("File not found");
		e.printStackTrace();
		System.out.println(e.getMessage());
		}
	}

}
