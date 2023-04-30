package com.array;

public class LCM {
	public static void main(String[] args) {
		int a = 8;
		int b = 12;
		int lcm = 0;
		for(int i=((a>b)?a:b);i<a*b;i++) {
			if(i%a==0 && i%b==0) {
				lcm = i;
				break;
			}
		}
		System.out.println(lcm);
	}
}
