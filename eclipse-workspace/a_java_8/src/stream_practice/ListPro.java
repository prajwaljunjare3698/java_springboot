package stream_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListPro {
	public static void main(String[] args) {
		List<Integer> b = new ArrayList<>(List.of(9,6,7,4,2,4,8));
//		a.stream().collect(Collectors.summarizingDouble(Integer::intValue)).getSum();
//		a.stream().filter(i-> i>5).map(i-> i*i).
		
		Random r = new Random();
		new Random().ints(1, 30).limit(1).forEach(System.out::println);
		List<String>a = new ArrayList<>(List.of("hi","pajral","rushi","sdfg77sd"));
		a.stream().filter(i-> i.length()>5).forEach(e-> System.out.println("leth is bigger "+e.length()));
	}
}
