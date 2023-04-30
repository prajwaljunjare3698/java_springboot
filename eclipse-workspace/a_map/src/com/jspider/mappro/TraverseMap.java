package com.jspider.mappro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TraverseMap {
	public static void main(String[] args) {
		Map<Integer, String>m = new HashMap<>();
		m.put(1, "first");
		m.put(2, "second");
		m.put(3, "third");
		m.put(5, "third");
		m.put(4, "fourth");
		
		Set<Entry<Integer, String>> map = m.entrySet();
		for(Entry<Integer, String> tr:map) {
			System.out.println(tr.getKey()+" "+tr.getValue());
		}
	}
}
