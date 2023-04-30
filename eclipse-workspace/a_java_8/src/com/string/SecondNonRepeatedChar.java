package com.string;

public class SecondNonRepeatedChar {
	public static void main(String[] args) {
		String s = "abcadaddbsg";
		
		for(int i=0;i<s.length();i++) {
			int count = 0;
			int second = 0;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					break;
				}
			}
			if(count==0) {
				second++;
			}			
		}
	}
}
