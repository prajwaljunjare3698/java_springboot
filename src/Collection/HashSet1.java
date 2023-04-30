package Collection;
import java.util.HashSet;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add(null);
		h.add(null);
		h.add("a");
		h.add('1');
		h.add(10);
		
		System.out.println(h);
		
	}
	
}
