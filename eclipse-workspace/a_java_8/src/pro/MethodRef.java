package pro;

public class MethodRef {
	public static void m1() {
		for(int i=1;i<=4;i++) {
			System.out.println("m1 method");
		}
	}
	
	public static void main(String[] args) {
		Runnable r = MethodRef::m1;
		Thread t = new Thread(r);
		t.start();
	}
}
       