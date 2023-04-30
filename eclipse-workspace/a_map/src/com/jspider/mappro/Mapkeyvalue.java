package com.jspider.mappro;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Mapkeyvalue {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();
		h.put(4, "ratan");
		h.put(2, "sravya");
		h.put(3, "durga");
		h.put(5, "durga");
		
		System.out.println(h);
		
		LinkedHashMap<Integer, String> h1 = new LinkedHashMap<>();
		h1.put(4, "ratan");
		h1.put(2, "sravya");
		h1.put(3, "durga");
		h1.put(5, "durga");
		
		System.out.println(h1);
		
		Set key = h.keySet();
		System.out.println(key);
		
		Collection values = h.values();
		System.out.println(values);
	}
}
