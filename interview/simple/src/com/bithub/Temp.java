package com.bithub;

import java.util.ArrayList;
import java.util.List;

public class Temp {
	public static void main(String[] args) {
		String s = "prajwal";
		List<Character> c = new ArrayList<>(List.of('a','i','o','u'));
		
		for(int i=0;i<s.length();i++) {
			if(c.contains(s.charAt(i))) {
				System.out.println("vowels present");
			}
		}
	}
}

	
	