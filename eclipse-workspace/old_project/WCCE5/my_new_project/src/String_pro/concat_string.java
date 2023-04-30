package String_pro;

public class concat_string {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "xyz";
		String s3 = "";
		for(int i=0;i<s.length();i++) {
			s3 = s3+s.charAt(i)+s1.charAt(i);
		}
		System.out.println(s3);
	}
}
