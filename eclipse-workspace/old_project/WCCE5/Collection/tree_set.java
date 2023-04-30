package Collection;
import java.util.TreeSet;
public class tree_set {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(10);
		t.add(20);
		t.add(13);
		t.add(2);
		//t.add(true);		//get ClassCastException
		System.out.println(t);		
	}
}
