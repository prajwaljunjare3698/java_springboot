package pro;

import java.util.Scanner;

public class Exce {
	public static void main(String[] args)throws Exception
	{
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=21) {
			System.out.println("eligible");
		}
		else {
			throw new  gfgf("not eligible");
		}
	}
}
