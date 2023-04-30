package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program5 {
	public static void main(String[] args) {
		ArrayList  al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al+"  "+al.size());
		System.out.println("----------------");
		LinkedList l = new LinkedList();
		l.addAll(al); // is used to add objects form one collection another collection
		l.add(40);
		System.out.println(l+" "+l.size());
		System.out.println(al.containsAll(l));
		
	}

}
