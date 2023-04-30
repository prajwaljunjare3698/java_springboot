package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set_pro {
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add(12);
		s.add(12);
		s.add(4);
		s.add("abc");
		s.add(4);
		s.add("hi");
		
		System.out.println(s); 		//insertion order is not maintained
		
		//iterating elements
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
