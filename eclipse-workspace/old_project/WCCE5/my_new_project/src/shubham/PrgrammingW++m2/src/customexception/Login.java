package customexception;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user id ");
		String id =s.nextLine();
		System.out.println("Enter a password ");
		int password = s.nextInt();
		if(id.equals("Teddy"))
		{
			if(password== 12345)
			{
				System.out.println("Login successfull");
			}
			else
			{
				try
				{
				throw new InvalidPasswordException();
				}
				catch(Exception e)
				{
				System.out.println("Invalid password ");
				}
			}}
		else
		{
			System.out.println("Invalid user name");
		}
	}

}
