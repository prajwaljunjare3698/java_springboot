package Maps;

import java.util.HashMap;

public class Program5 {
	public static void main(String[] args) {
		HashMap h = new HashMap();
				
		h.put(1, "Dell");
		h.put(2, "Hp");
		
		System.out.println(h);
		System.out.println("------------");
		
		h.put(1, "Ibm");
		System.out.println(h);
	}

}
