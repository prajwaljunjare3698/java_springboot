package com.jspider.mappro;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapPro {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(1, "ratan");
		t.put(6, "sravya");
		t.put(3, "durga");
		t.put(2, "girish");
		System.out.println(t);
		
		SortedMap<Integer,String> subMap = t.subMap(1, 5);
		System.out.println(subMap);
	}
}
