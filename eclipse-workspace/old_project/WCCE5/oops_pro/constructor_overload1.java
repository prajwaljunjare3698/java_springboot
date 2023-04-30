package oops_pro;

public class constructor_overload1 extends constructor_overload{
	int var = 12;
	String name = "sapkal";
	int var2 = 23;
	static String name3 = "arzoo";
	String name2 = "priyanka";
	
	constructor_overload1(){
		this(3);
		System.out.println("lakhan");
		this.name = "pankaj";
	}
	{
		m1();
		System.out.println("akkya");
		display();
		this.name = "shubham";
		m2();
	}
	public void m1() {
		System.out.println(var2);
		m2();
		this.name3 = "bye";
		System.out.println("no arg method");
	}
	static {
		m2();
	}
	constructor_overload1(int a){
		this("shradha");
		name2 = "gayatri";
		System.out.println("parmar");
		show();
		
		this.var = 20;		
	}
	public void show() {
		name3 = "akshay";
		m1();
		System.out.println(name2);
		var2 = 38;
		System.out.println("show");		
	}
	constructor_overload1(String a){
		this("first","second");
		System.out.println("hii");
	}
	constructor_overload1(int first,String second,int third,String fourth){
		m2();
		this.var = 55;
		System.out.println(name2);
	}
	public static void m2() {
		System.out.println(name3);
	}
	constructor_overload1(String n1,String n2){
		this(10,"string",89,"visabpur");
		m2();
		name = "priya";
		m1();
		System.out.println(name);
		System.out.println(name2);
		this.name3 = "priyanka";
	}
	public static void main(String[] args) {
		constructor_overload1 obj = new constructor_overload1();
		obj.show();
		obj.name = "a";
		System.out.println(obj.name3);
		obj.display();
		obj.name2 = "b";
		m2();
		obj.name3 = "c";
		System.out.println("end");
	}
}
