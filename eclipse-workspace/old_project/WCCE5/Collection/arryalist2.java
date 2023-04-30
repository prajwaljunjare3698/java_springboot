package Collection;

import java.util.ArrayList;

public class arryalist2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(2);
		a.add(4);
		a.add("abc");
		a.add(200);
		
//		boolean b = a.contains(3);	//check element is present in list or not
//		boolean c = a.isEmpty();	//check list is empty or not
//		int size = a.size();		//return size(length) of list
//		Object d = a.remove(0);		//remove index value
//		
		
		//System.out.println(d);
		
//		System.out.println(a.remove(1));
//		System.out.println(a.remove("abc"));
		
		ArrayList b = new ArrayList();
		b.add("abc");
		b.add(2);
		
		a.removeAll(b);		//element of -b- present in-a- are removed
		a.removeAll(a);		//remove all element of a
		a.clear();   		//another way ot remove all element of a
		
		System.out.println(b);
		System.out.println(a);
	}
}
