package collections;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		System.out.println("-----------");
		System.out.println(l.size());
		System.out.println("------------");
		System.out.println(l.get(2));
		//System.out.println(l.get(250));
		System.out.println("-------------");
		System.out.println(l.contains(10));
		System.out.println(l.contains("java"));
		System.out.println("----------------");
		l.remove(2);
		System.out.println(l);
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println(l);
	}

}
