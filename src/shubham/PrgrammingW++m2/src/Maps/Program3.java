package Maps;

import java.util.LinkedHashMap;
import java.util.Set;

public class Program3 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> l = new LinkedHashMap();
		l.put(10, "java");
		l.put(20, "python");
		l.put(30, "ruby");
		l.put(40, "php");
		Set<Integer> s = l.keySet();
		
		for(int i:s)
		{
			System.out.println(i  +"  "+ l.get(i));
		}
	}

}
