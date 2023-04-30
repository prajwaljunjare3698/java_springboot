package collections;

import java.util.ArrayList;

public class Program3 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		
		l.add(1, 40);
		System.out.println(l);
		l.set(1, 50);
		System.out.println(l);
		System.out.println(l.indexOf(50));
		System.out.println(l.indexOf(60));
	}

}
