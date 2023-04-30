package oops_pro;

public class super_keyword2 extends super_keyword1 {
	public void display() {
		System.out.println(super.a);
		super.s = "mahima";
	}
	public static void main(String[] args) {
		super_keyword2 obj = new super_keyword2();
		obj.display();
		System.out.println(obj.s);
	}
}
