package collections;

import java.util.ArrayList;

public class Program9 {
	public static void main(String[] args) {
		int a =10;
		char b ='A';
		
		ArrayList l = new ArrayList();
		
		l.add(a); //l.add(new Integer(a) -> l.add(new Intger(10));
		
		l.add(b); // l.add(new Character(b) -> l.add(new Character('A');
		
		l.add(12.34);//                        ->l.add(new Double(12.34);
		
		for(Object obj: l)
		{
			System.out.println(obj);
		}
		
		// Autoboxing// unboxing happen internal;
		
	}

}
