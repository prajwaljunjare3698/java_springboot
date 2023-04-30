package jdbc1;
class demo{
	int a=10;
	static {
		System.out.println("static of demo");
	}
	{
		System.out.println("non static");
	}
	public static void main(String[] args) {
		
	}
}

public class class_for_name {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class.forName("demo");
	}
}
