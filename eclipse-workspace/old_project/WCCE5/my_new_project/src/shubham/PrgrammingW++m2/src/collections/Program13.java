package collections;

import java.util.TreeSet;

public class Program13 {
	public static void main(String[] args) {
		TreeSet<Integer>  t = new TreeSet();
		t.add(40);
		t.add(30);
		t.add(10);
		t.add(50);
		t.add(20);
		t.add(40);
       for(int i : t)
       {
    	   System.out.println(i);
       }
	}

}
