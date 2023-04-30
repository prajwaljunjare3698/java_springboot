++m2.src.CustomSorting;

import java.util.TreeSet;

public class Mdriver {
	public static void main(String[] args) {
		Moive m1 = new Moive("KGF", 12.34);
		Moive m2 = new Moive("Puspha", 12.32);
		Moive m3 = new Moive("RRR", 12.36);
		
		SortByMovieName name = new SortByMovieName();
		
		SortByPrice price = new SortByPrice();
		
		TreeSet<Moive> t = new TreeSet(name);
		t.add(m1);
		t.add(m2);
		t.add(m3);
		t.add(new Moive("BhoolBhoolya", 12.38));
		t.add(new Moive("Vikram", 12.31));
		
		for(Moive m : t)
		{
			System.out.println(m);
		}
	}

}
