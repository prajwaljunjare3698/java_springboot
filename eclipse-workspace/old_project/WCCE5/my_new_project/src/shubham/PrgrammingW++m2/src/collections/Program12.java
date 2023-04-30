package collections;

import java.util.LinkedHashSet;

public class Program12 {
	public static void main(String[] args) {
		LinkedHashSet<String> l = new LinkedHashSet();
		l.add("java");
		l.add("javascript");
		l.add("selinum");
		l.add("sql");
		l.add("sql");
		l.add("java");
		l.add("sap");
		
		for(String s : l)
		{
			System.out.println(s);
		}
	}

}
