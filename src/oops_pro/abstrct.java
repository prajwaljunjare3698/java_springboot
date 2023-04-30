package oops_pro;

abstract class abstrct {
	int a;
	static String s;
	abstrct(){
		this.a = 10;
		this.s = "String";
	}
	abstract public void test();
	
	public void show_a() {
		System.out.println(this.a);
	}
	public static void show_s() {
		System.out.println(s);
	}
	static {
		System.out.println("initializer");
	}
	{
		System.out.println("non static initializer");
	}
	
}

