package com.jspider.Main;

import com.jspider.Thread.MyThread1;
import com.jspider.Thread.MyThread2;

public class MyThread2_Main {
	public static void main(String[] args) {
		MyThread2 mythread2 = new MyThread2();
		Thread thread = new Thread(mythread2);
		thread.setName("MyThread-1");
		thread.start();
		
		MyThread1 mythread1 = new MyThread1();
		mythread1.setName("MyThread-2");
		
		mythread1.start();
		
	}
}
