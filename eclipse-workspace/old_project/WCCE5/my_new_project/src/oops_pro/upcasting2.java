package oops_pro;

public class upcasting2 extends upcasting1 {
	int b =20;
	public static void main(String[] args) {
		//upcasting1 obj = new upcasting1();
		//upcasting1 obj = new upcasting2();
		//upcasting2 obj2 = obj;
		//upcasting1 obj = new upcasting1();
//		upcasting1 a = new upcasting1();
//		upcasting2 obj1 = (upcasting2)a;
//		System.out.println(a.a);
		//System.out.println(obj.b);
		
		
		upcasting1 j1 = new upcasting2();
		upcasting2 j2 = (upcasting2)j1;
		
	}
}
