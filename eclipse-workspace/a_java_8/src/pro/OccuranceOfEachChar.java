package pro;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachChar {
	public static void main(String[] args) {
		String s = "arzooarrrr";
		
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
				
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);
	}
}
