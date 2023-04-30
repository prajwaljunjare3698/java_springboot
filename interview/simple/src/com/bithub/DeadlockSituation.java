package com.bithub;

public class DeadlockSituation {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		
		Runnable r1 = ()->{
			synchronized (s1) {
				System.out.println(s1+" "+Thread.currentThread().getName());
				synchronized (s2) {
					System.out.println(s2+" "+Thread.currentThread().getName());
				}
			}
		};
		Runnable r2 = ()->{
			synchronized (s2) {
				System.out.println(s2+" "+Thread.currentThread().getName());
				synchronized (s1) {
					System.out.println(s1+" "+Thread.currentThread().getName());
				}
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
