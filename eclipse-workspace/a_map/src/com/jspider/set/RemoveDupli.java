package com.jspider.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupli {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,3,4,3,2,3,4,5,6));
		
		HashSet<Integer> l = new HashSet<>(a);
		System.out.println(l);
	}
}
