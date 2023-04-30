package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckLength {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>(List.of("durga","kajal","sravya","sdaksjha"));
		
		Predicate<String> p = i-> i.length()>6 && i.charAt(0)=='d';
		
		for(String s:a) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}
}
