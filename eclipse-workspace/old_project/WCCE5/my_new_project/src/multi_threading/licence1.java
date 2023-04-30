package multi_threading;
class medical extends Thread{
	public void run() {
		try {
			System.out.println("medical Started");
			Thread.sleep(400);
			System.out.println("medical completed\n");
		}
		catch(InterruptedException e) {
			System.out.println("");
		}
	}
}
class test extends Thread{
	public void run() {
		try {			
			System.out.println("drive test Started");
			Thread.sleep(400);
			System.out.println("drive test complted\n");
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
class rto extends Thread{
	public void run() {
		try {
			System.out.println("RTO get file observing");
			Thread.sleep(400);
			System.out.println("singed the file\n");
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
public class licence1 extends Thread {
	public static void main(String[] args) throws InterruptedException {
		medical m = new medical();
		m.start();
		m.join();	//medical thread exceute until complete
		//main thread stops
		
		test t = new test();
		t.start();
		t.join();  //test thread exceute until complete
		//main thread stops
		
		rto r = new rto();		
		r.start();
		r.join();	//rto thread exceute until complete
		//main thread stops
		
		
		
		//lastly main thread is ongoing
		System.out.println("here your licence");
	}
}