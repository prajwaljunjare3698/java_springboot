package com.pros;

public class SumTillSingleNo {
	public static void main(String[] args) {
		int no = 8575;
		int sum = 0;
		
		while(no>0) {
			
			sum = sum + no%10;
			no = no/10;
			
			if(sum > 9 && no<=0) {
				no = sum;
				sum=0;
			}
		}		
		System.out.println(sum);
	}
}
