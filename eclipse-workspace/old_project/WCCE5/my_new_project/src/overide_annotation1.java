class Demo{
	int a =10;
	public void simple() {
		System.out.println("simple in demo");
	}
}
public class overide_annotation1 extends Demo {
	int a = 20;
	@override
	public void simple() {
		System.out.println("simple in child class");
	}
	public static void main(String[] args) {
		overide_annotation1 obj = new overide_annotation1();
		
		obj.simple();
		System.out.println(obj.a);
	}
}
