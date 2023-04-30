package com.array;

public class HCF {
	public static void main(String[] args) {
		int a = 8;
		int b = 12;
		int hcf = 0;
		for(int i=((a>b)?a:b);i>1;i--) {
			if(a%i==0 && b%i==0) {
				hcf = i;
				break;
			}
		}
		System.out.println(hcf);
		
		//after hcf, lcm is easy to get by formula
		int lcm = (a*b)/hcf;
		System.out.println(lcm);
	}
}
