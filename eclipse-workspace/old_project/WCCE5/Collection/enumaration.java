package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class enumaration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(1);
		v.add(null);
		v.add("abc");
		v.add("akash");
		System.out.println(v);
		
		Iterator i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator li = v.listIterator();
		while(li.hasNext()) {
			li.next();
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
