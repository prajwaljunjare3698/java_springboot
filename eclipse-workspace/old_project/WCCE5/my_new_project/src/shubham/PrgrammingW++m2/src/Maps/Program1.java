package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Program1 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(10, "Teddy");
		h.put(20, "Dinga");
		h.put(30, "Smith");
	
		System.out.println(h);
		LinkedHashMap l = new LinkedHashMap();
		l.put(10, "A");
		l.put(20, "B");
		l.put(30, "C");
		System.out.println(l);
	}

}
