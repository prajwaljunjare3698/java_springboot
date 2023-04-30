package oops_pro;

public class singleton1 {
	
	static singleton1 obj=new singleton1();
	
	private singleton1() {
		
	}
	public static singleton1 getInstance() {
		return obj;
	}
}
