package com.bithub;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tricky {
	public static void main(String[] args) {
		List<Integer>a = new ArrayList<>(List.of(88,56,4,55,90));
		a.add(2);
		a.add(1);
		a.add(6);
		System.out.println(a);
		
		outerloop:
			for(int i=1;i<=5;i++) {
				for(int j=i+1;j<10;j++) {
					for(int k=j+1;k<11;k++) {
						System.out.println("outer");
						break outerloop;
					}
				}
			}
		System.out.println("done");
	}
}
