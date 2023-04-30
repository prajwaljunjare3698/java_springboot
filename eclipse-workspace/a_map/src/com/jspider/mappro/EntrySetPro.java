package com.jspider.mappro;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetPro {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<>();
		h.put(1, "ratan");
		h.put(3, "first");
		h.put(8, "ratan"); 
		h.put(2, "durga");
		
		Set<Entry<Integer,String>> entrySet = h.entrySet();
		System.out.println(entrySet);
		
		for(Entry<Integer,String> e:entrySet) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
