package com.string;

public class ReverseAlternate {
	public static void main(String[] args) {
		String a = "Differant Types of Pages";//SEGAp FO SEPYt TNAREFFId
		String s = "";
		
		for(int i=0;i<a.length();i++) {
			String temp = a.charAt(i)+"";
			
			if(a.charAt(i)>=65 && a.charAt(i)<=92) {				
				s = temp.toLowerCase()+s;
			}
			else if(a.charAt(i)>=97 && a.charAt(i)<=123) {
				s = temp.toUpperCase()+s;
			}
			else {
				s = " "+s;
			}
		}
		System.out.println(s);
	}
}
