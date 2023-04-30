package oops_pro;

public class abstrct1 extends abstrct {
	public void test() {
		System.out.println("implementation of abstract class method");
	}
	public static void main(String[] args) {
		abstrct1 a = new abstrct1();
		a.test();
		System.out.println(a.a);
		a.a=120;
		System.out.println(a.s);
		a.s="prerna";
		a.show_a();
		a.show_s();
	}
}
