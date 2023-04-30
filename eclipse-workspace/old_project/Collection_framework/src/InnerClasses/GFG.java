package InnerClasses;
import java.util.Scanner;

class staticclasses {
	static int s;
	static void met(int x, int y)
	{
		System.out.println(
			"static method to calculate sum");
		s = x + y;
		System.out.println(x + "+" + y);
	}
	static class MyNestedClass {
		static
		{
			System.out.println("static block inside a static class");
		}
		public void disp()
		{
			int x1;
			int y1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			met(x1, y1);
			System.out.println("Sum of the 2 numbers-" + s);
		}
	}
}
public class GFG {
	public static void main(String args[])
	{
		staticclasses.MyNestedClass nestedclass	= new staticclasses.MyNestedClass();
		nestedclass.disp();
	}
}
