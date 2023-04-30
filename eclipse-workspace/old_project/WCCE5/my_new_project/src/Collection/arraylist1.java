package Collection;
import java.util.ArrayList;
public class arraylist1 {	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(1);
		a.add(12);
		a.add("hi");
		a.add('d');
		a.add(null);
		System.out.println(a.add(false));
		
		
		ArrayList a2 = new ArrayList();
		a2.addAll(a);			//adding all element of a into a2
		
		
		System.out.println(a2);
	}
}
