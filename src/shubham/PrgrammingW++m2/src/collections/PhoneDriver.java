package collections;

import java.util.ArrayList;

public class PhoneDriver {
	public static void main(String[] args) {
		Phone  p1 = new Phone("Iphone",120000);
		Phone p2 = new Phone("Samsung",70000);
		Phone p3 = new Phone("OnePlus",70000);
		
		
		ArrayList<Phone> l = new ArrayList();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		for(Phone p : l)
		{
		System.out.println(p);
		 //System.out.println(p.brand +" "+p.cost);
		}
		
	}

}
