package com.jspider.mappro;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
	public static void main(String[] args) {
		Map<Integer,Character> map = new HashMap<>();
		map.put(1, 'a');
		map.put(2, 'b');
//		System.out.println(map);
		
		for(int i=1;i<=map.size();i++) {
			System.out.println(map.entrySet());
		}
	}
}
