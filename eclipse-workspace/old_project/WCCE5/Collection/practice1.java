package Collection;

import java.util.LinkedList;

public class practice1 {
	public static void main(String[] args) {
		LinkedList <String> l = new <String> LinkedList();
		LinkedList <String> l1 = new <String> LinkedList();
		
		l.add("h");
		l.add("hello");
		l.add("aksa");
		l.add("abhya");
		
		l1.add("prajwal");
		l1.add("junare");
		l1.add("developer");
		l1.add("tester");
		l1.add("abhya");
		
		l.removeAll(l1);
		System.out.println(l);
	}
	
	
	
}
