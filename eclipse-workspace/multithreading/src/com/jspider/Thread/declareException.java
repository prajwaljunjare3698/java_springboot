package com.jspider.Thread;
class audio extends Thread{
	public void run() {
		try {
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class declareException {
	public static void main(String[] args) throws InterruptedException  {
		add();
	}
	public static void add() throws InterruptedException  {
		Thread.sleep(200);
		m1();
	}
	public static void m1() throws InterruptedException {
		Thread.sleep(300);
	}
}

