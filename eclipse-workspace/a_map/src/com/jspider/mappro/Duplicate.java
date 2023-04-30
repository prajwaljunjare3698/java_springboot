package com.jspider.mappro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>(Arrays.asList(1,1,1,1,1,2,2));
	
		Map<Integer, Integer> m = new HashMap<>();
		
		for(int i=0;i<a.size();i++) {
			if(m.containsKey(a.get(i))) {
				m.remove(a.get(i));
			}
			else {
				m.put(a.get(i), i);
			}
		}
		System.out.println(m);
	}
}
