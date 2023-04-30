package singleton_break;
class Singletn implements Runnable{
	static Singletn obj = new Singletn();
	private Singletn() {
		
	}
	public static Singletn getInstance() {
		return obj;
	}
	@Override
	public void run() {
		System.out.println("run");
	}
}

public class BreakByThread1 {
	public static void main(String[] args) {
		Singletn s1 = Singletn.getInstance();
		s1.st
	}
}
