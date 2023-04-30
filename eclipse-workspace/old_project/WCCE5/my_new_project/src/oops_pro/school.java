package oops_pro;

//we cant access non static var in static block without create obj
public class school {	
	static school obj;
	static school a1 = new school("abc");
	
	static int a = 10;
	String school_name = "qspider";
	String name;
	school(String b){
		this.name = b;
	}
	public void show() {
		System.out.println(school_name+" "+name);
	}
	public static void main(String[] args) {
		//school obj = new school("akash");
		//obj.show();
		same();
	}	
	public static void same() {		
		System.out.println(a1.a);
	}
}
