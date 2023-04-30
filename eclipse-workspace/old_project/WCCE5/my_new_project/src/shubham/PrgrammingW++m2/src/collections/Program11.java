package collections;

import java.util.HashSet;

public class Program11 {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(null);
		h.add(10);
		h.add(12.34);
		h.add(10);
		h.add('A');
		h.add("Hi");
		h.add("Hi");
		
		System.out.println(h);
		System.out.println("-----------");
		
		System.out.println(h.size());
		for(Object obj:h)
		{
			System.out.println(obj);
		}
		
	}

}
