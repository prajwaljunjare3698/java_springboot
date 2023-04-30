package oops_pro;

public class constructor_overload {
	int a = 10;
	String s = "abc";
	static double b = 28.5;
	
	constructor_overload(int a){
		this("hi");
		System.out.println("pankaj");
	}
	constructor_overload(String s){
		this(1,"ab");
		a = 100;
		display();
		System.out.println("akshay");
	}
	constructor_overload(int a,String s){
		this.a = 200;
		this.s = "ishwarr";
		System.out.println("pooja");
	}
	constructor_overload(){
		this(3);
		System.out.println("ajay");
		b = 39.7;
	}
	public void display() {
		System.out.println("this is display method");
	}
	{
		System.out.println(a);
		System.out.println(s);
		System.out.println(b);
	}
	public static void main(String[] args) {
		constructor_overload obj = new constructor_overload();
		System.out.println(obj.a);
		System.out.println(obj.s);
	}
	
}	

