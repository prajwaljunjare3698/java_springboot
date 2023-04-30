package multi_threading;
public class timer1 {
	public static void main(String[] args)throws InterruptedException {
		int j=0;
		int time = 0;
		String s = "";
		for(int i=1;i<=2000;i++) {
			j++;
			if(j==60) {
				time = time+1;
				s=""+time;
				j=0;
			}
			if(time<10) {
				if(j<10) {
					System.out.println("0"+time+":"+"0"+j);
				}
				else {
					System.out.println("0"+time+":"+j);
				}
			}
			else {
				if(j<10) {
					System.out.println(time+":"+"0"+j);
				}
				else {
					System.out.println(time+":"+j);
				}
			}
			Thread.sleep(100);
			//System.out.print("\033[H\033[2J");  
			System.out.flush();  
		}
	}
}
