package String_pro;

public class string_combination1 {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "";
			
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=i+1;j<=s.length();j++) {
				if(count==0) {
					if(j>=s.length()) {
						s1=s1+s.charAt(i)+s.charAt(j-s.length());
					}
					else {
						s1=s1+s.charAt(i)+s.charAt(j);
					}
					count++;
				}
				else {
					s1=s1+s.charAt(j);
				}
			}
			System.out.println(s1);
			s1="";
		}
	}
}
