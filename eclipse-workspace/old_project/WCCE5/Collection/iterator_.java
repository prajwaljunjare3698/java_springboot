package Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
public class iterator_ {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add(4);
		l.add(8);
		l.add("hi");
		System.out.println(l);
		
		//iterate by Iterator
		Iterator itr = l.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		itr.next();
		itr.next();
		itr.next();
		//iterate by ListIterator
		ListIterator li = l.listIterator();
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
