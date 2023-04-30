package exception_pro;

import java.util.Scanner;
public class custom_exception1 {
	public static void main(String[] args) throws custom_exception {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("eligible");
		}
		else {
			throw new custom_exception("not eligible");
		}
	}
}
