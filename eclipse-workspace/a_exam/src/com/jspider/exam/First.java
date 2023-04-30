package com.jspider.exam;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no");
		int no = sc.nextInt();
		
		int first = 0;
		int second = 1;
		int sum = 0;
		
		for(int i=1;i<=no;i++) {				
			sum = sum+first;		
			System.out.println(first);			
			int third = first+second;			
			first = second;
			second = third;
			third = first + second;			
		}
		if(sum%2==0) {
			System.out.println(sum+" is even");
		}
		else {
			System.out.println(sum+" is odd");
		}
		sc.close();
	}
}
