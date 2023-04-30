package shubham.ProgrammingW++m2.src.strings;

public class Strings1 {
	public static void main(String[] args) {
		String s1 ="hello";
		String s2 ="hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		int h1=s1.hashCode();
		int h2=s2.hashCode();
		System.out.println("----------");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println("----------");
		Strings1 s = new Strings1();
		Strings1 s3 = new Strings1();
		System.out.println(s);
		System.out.println(s3);
		System.out.println(s==s3);
		System.out.println(s.equals(s3));
		System.out.println("-----------");
		
		String a= new String("hi");
		String a1= new String("Hi");
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		System.out.println(a.equalsIgnoreCase(a1));
		System.out.println("-----------");
		System.out.println(a);
		System.out.println(a1);
	}

}
