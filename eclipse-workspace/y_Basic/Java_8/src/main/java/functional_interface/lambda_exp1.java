package functional_interface;

interface Test{
	public abstract void add();
}
public class lambda_exp1 implements Test {
	//1st way (regular) to override method
	public void add() {
		System.out.println("by regular way");
	}
	public static void main(String[] args) {
		
//second way to override abstract method by creating anonymous or (inner) class
//		Test t = new Test() {
//			public void add() {
//				System.out.println("implemented add method");
//			}
//		};
//		t.add();		
		
		
//3rd way to override by lambda expression
//		Test t = () -> System.out.println("implementd by lambda exp");
//		t.add();
	}
}
