package Maps;

import java.util.HashMap;

public class Program2 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(10, "Teddy");
		h.put("Dinga", 20);
		h.put(1.2, 30);
	  
		System.out.println(h);
		// get value present in the key 
		System.out.println(h.get(10));
		// checks the key is present or not
		System.out.println(h.containsKey(1.2));
		System.out.println(h.containsKey(100));
		//checks the value is prsent or not
		System.out.println(h.containsValue("Teddy"));
		System.out.println(h.containsValue("Tom"));
		
		System.out.println(h);
		// remove element present in the based on key
		h.remove(10);
		System.out.println(h);
		// check container in empty or not
		System.out.println(h.isEmpty());
		//clears all the elements in the container
		h.clear();
		System.out.println(h.isEmpty());
	}

}
