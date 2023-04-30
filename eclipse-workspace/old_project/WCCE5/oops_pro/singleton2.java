package oops_pro;

public class singleton2 {
	public static void main(String[] args) {
		
		singleton1 obj = singleton1.getInstance();
		singleton1 obj1 = singleton1.getInstance();
						
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
}
