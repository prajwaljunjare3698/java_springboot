package String_pro;

public class count_char {
	public static void main(String[] args) {
		String s = "the i(s the$$ fou^# @n21_/.,mou* s, Doubl oeu";
		String s1 = "";
		String s2 = "";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				s1=s1+s.charAt(i);
				count++;
			}
			else {
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s1+" count "+count);
		System.out.println(s2);
	}
}
