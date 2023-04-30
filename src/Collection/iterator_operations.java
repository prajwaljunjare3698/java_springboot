package Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
public class iterator_operations {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(1);
		s.add(1);
		s.add(null);
		s.remove(1);
		s.add("a");
		System.out.println(s);
		
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(null);
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}
	
}
