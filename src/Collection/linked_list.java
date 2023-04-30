package Collection;

import java.util.LinkedList;

public class linked_list {
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("abc");
		l.add('e');
		l.add(null);
		l.add(1);
		LinkedList l2 = l;
		//System.out.println(l2);
		
		System.out.println(l.contains('a'));
		System.out.println(l.get(3));
	}
}
