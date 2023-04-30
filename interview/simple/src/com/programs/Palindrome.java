package com.programs;

public class Palindrome {
	public static void main(String[] args) {
		int no = 12321;
		int no2 = no;
		
		int rev = 0;
		while(no2>0) {
			int temp = no2%10;
			rev = rev*10 + temp;
			no2=no2/10;
		}
		if(rev==no) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}
}
