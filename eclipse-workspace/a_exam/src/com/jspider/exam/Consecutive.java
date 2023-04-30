package com.jspider.exam;

public class Consecutive {
	public static void main(String[] args) {
		String s = "423423";
		
		int no = Integer.parseInt(s);
		
		int con = no%10;
		int count = 0;
		while(no>0) {
			int temp = no%10;
			if(temp<=con) {
				
			}
			else {
				System.out.println("not");
				count++;
				break;
			}
			no = no/10;
		}
		if(count==0) {
			System.out.println("consecutive");
		}
		Consecutive c = new Consecutive();
		Consecutive c1 = new Consecutive();
		System.out.println(c1.hashCode());
	}
}			
