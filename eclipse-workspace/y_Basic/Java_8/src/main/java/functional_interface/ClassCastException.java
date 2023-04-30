package functional_interface;
class A{
	int a = 2;
	public void add() {
		System.out.println("from A");
	}
}
public class ClassCastException extends A {
	public void add2() {  
		System.out.println("from classcastexception");
	}
	public static void main(String[] args) {
		A obj1 = new ClassCastException();
		ClassCastException obj2 = (ClassCastException)obj1;
		obj2.add();
		obj2.add2();	
		
//		System.out.println(1/0);
//		A obj = new A();
//		ClassCastException obj2 = obj;
		
	}
}
