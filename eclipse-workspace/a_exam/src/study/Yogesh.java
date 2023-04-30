package study;

import java.util.Scanner;

class Yogesh {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		System.out.println("hii");
		
		
		updateEmp();
	}
	private static void updateEmp() {
		System.out.println("which employee do you want to update \n Employee no :");
		int empno = input.nextInt();
		
		System.out.println("Which field you want to change ? ");
		String field = input.nextLine();
		
		input.next();
		
		System.out.println("PASS THE PARAM");
		String parameter = input.nextLine();
		
		System.out.println(empno+" "+field+" "+parameter);
	}
}
