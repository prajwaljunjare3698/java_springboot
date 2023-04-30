package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Pro {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>(Arrays.asList(2,4,3,6,9));
				
		Consumer<Integer> c = no->{
			int count=0; 
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					count++; 
					System.out.println("not");
					break;
				}
			}
			if(count==0) {
				System.out.println("prime");
			}			
		};
		a.forEach(c);
		
//		or
		a.stream().forEach(no->{
			int count=0; 
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					count++; 
					System.out.println("not");
					break;
				}
			}
			if(count==0) {
				System.out.println("prime");
			}			
		});
	}
}
