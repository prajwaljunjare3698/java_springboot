package no_conversion;
public class bin_to_octal {
	public static void main(String[] args) {
		int bin = 1011101;
		String s = "";
		int octal = 0;
		int count=1;
		int mul = 1;
		int i = 1;
		int temp = 0;
		int pair = 1;
		boolean flag = true;
		while(bin>0) {
			if(flag) {				
					temp = bin%10;
					flag=false;
			}
			if(!flag) {
				if(i<count) {
					mul=mul*2;
					i++;
				}
				else {
					if(temp==1) {
						octal = octal + mul;
						//System.out.println(octal);
					}
					if(pair==3) {
						s = octal+s;
						System.out.println(s);
						octal = 0;
						pair = 1;
					}
					count++;
					mul = 1;
					flag = true;
					i = 1;
					
					bin = bin/10;										
				}
				pair++;
			}
		}
		System.out.println(s);
	}
}
