package strings;

public class Strings3 {
	public static void main(String[] args) {
		//empty string representation
		String s1 = new String();
		System.out.println(s1);
		
		// passsing a set element
		String s2 = new String("Hello");
		System.out.println(s2);
		
		// converting char[] to string object
		char []c= {'j','a','v','a'};
		
		String s3 = new String(c);
		System.out.println(s3);
	}

}
