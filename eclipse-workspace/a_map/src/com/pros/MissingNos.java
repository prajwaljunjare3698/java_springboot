package com.pros;

import java.util.ArrayList;
import java.util.List;

public class MissingNos {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>(List.of(3,1,5,4,3,2,7,9));
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		Integer min = l1.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		Integer max = l1.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		for(int i=min;i<=max;i++) {
			l2.add(i);
		}		
		l2.removeAll(l1);
		
		System.out.println(l2);
		
	}
}
