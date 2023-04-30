package exceptions;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :a ");
		int a = s.nextInt();
		System.out.println("Enter a number : b");
		int b = s.nextInt();
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
		   System.out.println("Cannot divide by zero");
		}
	}

}
