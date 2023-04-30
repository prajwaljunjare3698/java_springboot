package collections;

public class Program7 {
	public static void main(String[] args) {
		//Autoboxing
		
		int a =10; // primitive to nonprimitive
		Integer b = new Integer(a);
		System.out.println(a +" "+b);
		System.out.println("-------------");
		
		double c=12.34;
		Double d = new Double(c);
		System.out.println(c+" "+d);
		System.out.println("--------------");
		
		// AutoUnboxing
		Integer  e = new Integer(20);
		int f =e;
		System.out.println(e +"  "+f);
		
		Long g = new Long(123456);
		long h=g;
		System.out.println(h+ " "+g);
	}

}
