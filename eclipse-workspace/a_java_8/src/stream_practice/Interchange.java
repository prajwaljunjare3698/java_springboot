package stream_practice;

import java.util.ArrayList;
import java.util.List;

public class Interchange {
	public static void main(String[] args) {
		List<Integer>a = new ArrayList<>(List.of(21,34,22,56,77));
		while(3>1) {
		Integer temp = a.get(0);
		a.add(0,a.get(1));
		a.add(1,temp);
		System.out.println(a);
		}
	}
}
