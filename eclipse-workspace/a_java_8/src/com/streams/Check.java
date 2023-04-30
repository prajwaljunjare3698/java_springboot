package com.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Check {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("ratan", 45);
		h.put("durga", 23);
		h.put("sravya", 88);
		h.put("shubh", 35);
		
		Set<Entry<String,Integer>> entrySet = h.entrySet();
		for(Entry<String,Integer> e:entrySet) {
			if(e.getValue()<35) {
				System.out.println(e.getKey()+" "+e.getValue()+" failed");
			}
			else {
				System.out.println(e.getKey()+" "+e.getValue()+" passed");
			}
		}
		
		ArrayList<Integer> a = new ArrayList<>(h.values());
		long failed = a.stream().filter(i->i<35).count();
		System.out.println(failed);
		
	}
}
