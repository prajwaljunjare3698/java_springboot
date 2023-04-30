package Collection;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class linked_list1 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(19);
		l.add(20);
		l.add(null);
		l.add(null);
		l.add(20);
		
		//System.out.println(l);
//		for(Object i:l) {
//			System.out.println(i);
//		}
		
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		System.out.println("now using ListIterator");
		
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			li.next();
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}	
