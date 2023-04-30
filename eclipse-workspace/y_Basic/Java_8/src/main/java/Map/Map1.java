package Map;

import java.util.HashMap;
public class Map1 {
	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<>();
		m.put(1,"first");
		m.put(2, "second");
		m.put(3, "third");
		m.put(4, "fourth");
		
		System.out.println(m);
	}
}
