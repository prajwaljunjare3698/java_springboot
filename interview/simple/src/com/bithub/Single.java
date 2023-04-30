package com.bithub;
class Simple{
	private static Simple obj = null;
	private Simple() {}
	public static Simple getInstance() {
		if(obj==null) {
			return new Simple();
		}
		return obj;
	}
}
public class Single {
	public static void main(String[] args) {
		Runnable r1 = ()->{
			Simple obj = Simple.getInstance();
			System.out.println(obj.hashCode());
		};
		Runnable r2 = ()->{
			Simple obj = Simple.getInstance();
			System.out.println(obj.hashCode());
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
