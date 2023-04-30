package Collection;
import java.util.LinkedHashSet;
public class linked_hashset {
	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		lh.add(28);
		lh.add(2);
		lh.add(1);
		lh.add(null);
		lh.add(3);
		lh.add("abc");
		lh.add("abc");
		System.out.println(lh);
	}
}
