package collections;

public class Program15 {
	public static void main(String[] args) {
		String a ="A";
		String b ="B";
		
		System.out.println(a.compareTo(b));//-1
		System.out.println(b.compareTo(a));//+1
		System.out.println(a.compareTo(a));//0
		System.out.println(b.compareTo(b));//0
		System.out.println("--------------");
		
		Integer  c =10;
		Integer  d=20;
		System.out.println(c.compareTo(d));
		System.out.println(d.compareTo(d));
		System.out.println(d.compareTo(c));
		
		Double e =12.34;
		Double f = 34.56;
		System.out.println(e.compareTo(f));
		System.out.println(f.compareTo(e));
	}

}
