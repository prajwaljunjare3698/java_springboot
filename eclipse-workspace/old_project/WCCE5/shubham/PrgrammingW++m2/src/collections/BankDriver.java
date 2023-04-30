package collections;

import java.util.TreeSet;

public class BankDriver {
	public static void main(String[] args) {
		Banking b1 = new Banking("Indian bank",888888,1700000.37);
		Banking b2 = new Banking("Kotak Bank",999999,1700000.67);
		Banking b3 = new Banking("SBI",111111,1700000.17);
		
		TreeSet<Banking> t = new TreeSet();
		t.add(b1);
		t.add(b2);
		t.add(b3);
		
		for(Banking b : t)
		{
			System.out.println(b);
		}
	}

}
