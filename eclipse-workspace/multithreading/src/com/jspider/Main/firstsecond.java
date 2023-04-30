package com.jspider.Main;

import com.jspider.Thread.first;
import com.jspider.Thread.second;

public class firstsecond{
	public static void main(String[] args) throws InterruptedException {
		first t1 = new first();
		t1.start();
		second t2 = new second();
		t2.start();
	}
}