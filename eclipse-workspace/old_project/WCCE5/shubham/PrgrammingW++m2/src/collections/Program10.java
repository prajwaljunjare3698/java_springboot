package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Program10 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		System.out.println(l);
		
		LinkedList l1 = new LinkedList(l);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		
		Vector v = new Vector(l1);
		v.add(50);
		v.add(60);
		System.out.println(v);
	}

}
