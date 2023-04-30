package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class arraylist3 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(12);
		l.add(14);
		l.add("abc");
		l.add(null);
		l.add(true);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
