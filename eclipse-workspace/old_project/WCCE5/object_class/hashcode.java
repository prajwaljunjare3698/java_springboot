package object_class;

public class hashcode {
	int a = 10;
	String s = "abc";
	char c = 'd';
//	public hashcode(int a,String s,char c) {
//		this.a=a;
//		this.s=s;
//		this.c=c;
//	}
	public static void main(String[] args) {
		hashcode h = new hashcode();
		System.out.println(h.hashCode());
	}
	public int hashCode() {
		int s1 = s.hashCode();
		int c1 = c;
		return s1+c1;
	}
}
