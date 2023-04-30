package Collection;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_iterator {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(2);
		l.add(8);
		l.add(12);
		l.add(null);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			li.next();
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		li.add("rahul");
		li.add("pankaj");
		System.out.println(l);
		
	}
}
