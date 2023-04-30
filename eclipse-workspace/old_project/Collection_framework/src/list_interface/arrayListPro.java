package list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayListPro {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		
		a.add(20);
		a.add(12);
		a.add(10);
		a.add(23);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println();
		
	}
}
