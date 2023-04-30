package customexception;

import java.util.Scanner;

public class Matrimony {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		if(age>=21)
		{
			System.out.println("Get married soon");
		}
		else
		{
	    try
		{
			throw new AgeInvalidException(" Get older soon have patience");
		}
		catch (Exception e) 
	    {
			System.out.println(e.getMessage());
		}
		}
	}

}
