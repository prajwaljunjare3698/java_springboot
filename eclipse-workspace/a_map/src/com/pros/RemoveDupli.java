package com.pros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDupli {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(List.of(2,3,4,2,7,3,5,6,7));
		
		HashSet<Integer> h = new HashSet<>(a);
		System.out.println(h);
	}
}
