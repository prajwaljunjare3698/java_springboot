package Maps;

import java.util.Set;
import java.util.TreeMap;

public class Program4 {
	public static void main(String[] args) {
		TreeMap<String, Double> t = new TreeMap();
		
		t.put("Apple", 1.2);
		t.put("Mango", 3.4);
		t.put("Jackfruit", 5.6);
		t.put("Banana", 7.8);
		
		Set<String> key = t.keySet();
		for(String s: key)
		{
			System.out.println(s+  "   "+t.get(s));
		}
	}

}
