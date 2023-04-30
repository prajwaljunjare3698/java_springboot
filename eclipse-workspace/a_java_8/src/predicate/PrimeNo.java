package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrimeNo {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(List.of(2,3,4,6,7,8,9,11,13,15));
		
		Predicate<Integer> p = i-> {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					return false;
				}
			}
			return true;
		};
				
		for(Integer i:a) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}
}
