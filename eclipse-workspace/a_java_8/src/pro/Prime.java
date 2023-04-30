package pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Prime {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>(Arrays.asList(2,3,4,5,6,7));
		
		Consumer<Integer> c = no->{
			int count = 0;
			for(int i=2;i<no;i++) {
				if(no%i==0) {
					count++;
					System.out.println("not");
					break;
				}
			}
			if(count==0) {
				System.out.println("prime");
			}
		};		
		a.stream().forEach(c);
	}
}
