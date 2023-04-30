package pro;

import java.util.ArrayList;
import java.util.List;

public class OddNo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(List.of(3,4,13,43,66,5,6,7,8,9));
		
		Integer first = a.stream().filter(i-> i%2==1 && i>7).findFirst().get();
		System.out.println(first);
		
		Integer first1 = a.stream().filter(i -> i % 2 != 0).findFirst().get();
		System.out.println(first1);
	}
}
