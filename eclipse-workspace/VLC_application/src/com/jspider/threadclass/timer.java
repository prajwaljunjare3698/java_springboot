package com.jspider.threadclass;
public class timer extends Thread{
	public void run() {
		try {
			int count=0;
			for(int i=1;i<=5;i++) {
				System.out.println("showing timer "+ ++count);
				Thread.sleep(400);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}