package Practice;

public class upacast3 {
	public static void main(String[] args){
		upacast1 u = new upacast2();
		upacast2 u3 = new upacast2();
		u.display();
		System.out.println(u.a);
		System.out.println(u3.b);
		System.out.println("hi");
	}
}
