package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class hashMap3 {
	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(7, "first");
		m.put(2, "second");
		m.put(8, "third"); 
		m.put(1, "first");
		m.put(4, "fourth");
		m.put(5, "fifth"); 		
		Set s = m.entrySet();
		System.out.println(s.stream());
		
		//m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		//m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	
		// create a list of integers 
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
	  	    // demonstration of forEach method 
	    numbers.stream().map(x->x*x).forEach(y->System.out.println(y)); 
	
	    // collect method returns a set 
	    Set<Integer> squareSet = 
	    		numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
	    System.out.println(squareSet); 
	
	}
}
