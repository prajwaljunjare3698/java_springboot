package object_class;

public class get_class {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("simple");		
		get_class g = new get_class();
		System.out.println(g.getClass());
	}
	public void set() {
		System.out.println("one");
	}
}
