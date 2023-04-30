package Collection;
import java.util.ArrayList;
public class arrayList {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();	
		a.add(1);
		a.add(1);
		a.add(null);
		a.add(null);
		a.add(5);
		a.add("str");
		a.add('d');
		System.out.println(a);
		
		//iterating technique 1
//		for(Object i:a) {
//			System.out.println(i);
//		}
		
		//iterating technique 2
		add(1);
		
	}
	public static void add(int a) {
		if(a>0) {
			System.out.println(a);
		}
		add(a++);
	}
	
}