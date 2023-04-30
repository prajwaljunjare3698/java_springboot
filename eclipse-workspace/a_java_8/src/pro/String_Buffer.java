package pro;

public class String_Buffer {
	public static void main(String args[]) {
		String s1 = new String("yogesh");
		StringBuffer s2 = new StringBuffer("sawant");

		byString(s1);
		
		byStringBuffer(s2);
				
	}

	public static String byString(String s1) {
		String newString = "reliance";
		for(int i=1;i<=10000;i++) {
			newString = newString + s1;
		}
		long time = System.currentTimeMillis();
		System.out.println(time);
		return newString;
	}
	
	public static String byStringBuffer(StringBuffer s) {
		StringBuffer newString = new StringBuffer("satara");
		for(int i=1;i<=10000;i++) {
			newString.append(s);
		}
		long time = System.currentTimeMillis();
		System.out.println(time);
		return newString.toString();
	}
}
