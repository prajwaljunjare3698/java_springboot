package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Rushi {
	 public static void main(String args[]) {
		 
		 List<Integer>arr = new ArrayList<>(List.of(1,2,3,4,5));
		System.out.println(reverse(arr));
	    }
	    
	    public static List<Integer> reverse(List<Integer> arr){

	    	Integer[] a =  new Integer[arr.size()];
	    	a = arr.toArray(a);
	    	
//	    	List<Integer>list = new ArrayList<>(a);
	         return  List.of(1,2,3,4);
	    }
}
