package com.jspider.Main;

import com.jspider.Thread.MyThreadRunnable;

public class MyThread3_main{
	public static void main(String[] args) {
		MyThreadRunnable myt = new MyThreadRunnable();
		Thread thread = new Thread(myt);
		thread.start();
	}
	
}
