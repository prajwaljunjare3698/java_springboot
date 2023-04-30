package com.jspider.clone;

import java.util.ArrayList;
import java.util.Arrays;

public class ListClone {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(2,3,4,5,6));
		
		ArrayList<Integer> a2 = (ArrayList<Integer>) a1.clone();
		System.out.println(a2);
	}
}
