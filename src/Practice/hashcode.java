package Practice;

public class hashcode {
	int a =10;
	double d = 2.4;
	String s = "abc";
	public static void main(String[] args) {
		hashcode c = new hashcode();
		System.out.println(c.hashCode());
	}
	public int hashCode() {
		int d1 = (int)d;
		int s1 = s.hashCode();
		return d1+s1;
	}
}
