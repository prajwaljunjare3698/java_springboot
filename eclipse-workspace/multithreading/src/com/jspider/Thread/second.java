package com.jspider.Thread;
public class second extends Thread{
	public void run() {
		try {
			for(int i=1;i<=3;i++) {
				System.out.println("second"+Thread.currentThread().getName());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}