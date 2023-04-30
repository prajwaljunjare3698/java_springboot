package multi_threading;

class video extends Thread{
	public void run() {
		System.out.println("video is showing");
		for(int i=1;i<=3;i++) {
			System.out.println("video");
		}
	}
}
class music extends Thread{
	public void run() {
		System.out.println("music is playing");
		for(int i=1;i<=3;i++) {
			System.out.println("music");
		}
	}
}
class subtitle extends Thread{
	public void run() {
		System.out.println("display subtitle");
		for(int i=1;i<=3;i++) {
			System.out.println("subititle");
		}
	}
}
class timer extends Thread{
	public void run() {
		System.out.println("timer is onging");
		for(int i=1;i<=3;i++) {
			System.out.println("timer");
		}
	}
}
public class vlc_task{
	public static void main(String[] args) {
		video thread1 = new video();		
		music thread2 = new music();	
		subtitle thread3 = new subtitle();		
		timer thread4 = new timer();
		
		thread3.start();
		thread2.start();
		thread1.start();
		thread4.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" thread");
		}
	}
}
