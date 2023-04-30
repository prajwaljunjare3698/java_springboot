package pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Temp {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,8,3,4,5));
		
		List<Integer> even = a.stream().filter(i-> i%2==0).collect(Collectors.toList());
		
		List<Integer> mul = a.stream().map(i->i*4).collect(Collectors.toList());
		
		a.remove(Integer.valueOf(3));	
				
		System.out.println(a);
	}
}
