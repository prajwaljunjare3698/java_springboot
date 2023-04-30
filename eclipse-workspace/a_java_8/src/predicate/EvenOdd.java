package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvenOdd {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(List.of(2,3,4,6,7,8,9));
		
		Predicate<Integer> p = i-> i%2==0;
		
		for(Integer i:a) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}		
		System.out.println(a);
	}
}
