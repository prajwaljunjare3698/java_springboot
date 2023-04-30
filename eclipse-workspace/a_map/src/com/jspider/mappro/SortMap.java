package com.jspider.mappro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class SortMap {
	public static void main(String[] args) {
		Map<String, Integer>m = new HashMap<>();
		m.put("z", 5);
		m.put("g", 2); 
		m.put("w", 5);
		m.put("i", 3);
		m.put("s", 11);
		m.put("b", 8);

//		Map<String,Integer> collect = m.entrySet().stream() 
//		.sorted(Map.Entry.comparingByValue()) 			
//		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
//		(oldValue, newValue) -> oldValue, LinkedHashMap::new));
//		System.out.println(collect);
		
		Stream<Entry<String,Integer>> sorted = m.entrySet().stream().sorted(Map.Entry.comparingByValue());
		sorted.forEach(System.out::println);


	}
}
