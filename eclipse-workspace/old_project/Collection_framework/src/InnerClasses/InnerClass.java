package InnerClasses;

public class InnerClass {
	
	class inner{
		static int a = 10;
		public static void main(String[] args) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		System.out.println("outer class");
		InnerClass.inner i;
		System.out.println(InnerClass.inner.a);
	}
}
