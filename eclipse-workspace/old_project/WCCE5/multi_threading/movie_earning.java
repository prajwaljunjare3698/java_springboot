package multi_threading;
class total_money extends Thread{
	int sum = 0;
	public void run(){
		sum = 100;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
	}
}

public class movie_earning {
	public static void main(String[] args) throws InterruptedException {
		total_money obj = new total_money();
		
		obj.start();
		obj.join();
		System.out.println(obj.sum);
		
	}
}
