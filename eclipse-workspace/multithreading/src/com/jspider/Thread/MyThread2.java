package com.jspider.Thread;

public class MyThread2 extends Thread {

	@Override
	public void run() {		
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		} 		
	}

}
