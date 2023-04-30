package com.jspider.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Pro {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
				
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
						
//			char c = s.charAt(i);
//			String d = Character.toString(c);
//			int b = c;
//			
//			if(c>=47 && c<=56) {
//				
//				int no = Integer.parseInt(d);
//				if(no<=5) {
//					list.add(d);
//				}
//			}
//			else if(c == ' ') {
//				
//			}
//			else {
//				list.add(d);
//			}
			if(s.charAt(i)!='6' && s.charAt(i)!='7'&& s.charAt(i)!='8' && s.charAt(i)!='9' && s.charAt(i)!=' ') {
				list.add(Character.toString(s.charAt(i)));
			}
		
		}
		System.out.println(list);
	}
}
