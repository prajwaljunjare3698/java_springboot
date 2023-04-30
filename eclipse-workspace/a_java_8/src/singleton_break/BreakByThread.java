package singleton_break;
class Singl implements Runnable{

	static Singl obj;
	public void run() {
		System.out.println("run");
	}
	private Singl() {
	}
	public static Singl getSingl() {
		if(obj==null) {
			return obj = new Singl();
		}
		return obj;
	}
}
public class BreakByThread {
	public static void main(String[] args) {
		Singl t1 = Singl.getSingl();
		t1.start();
		Singl t2 = Singl.getSingl();
		t2.start();
		
//		Thread t = new Thread(new Singl());
		
//		System.out.println(t1.hashCode());
//		System.out.println(t2.hashCode());
	}
}
