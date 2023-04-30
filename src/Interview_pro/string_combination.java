package Interview_pro;

public class string_combination {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "";
		String s2 = "";
		boolean flag=true;
		int i=0;
		int j=i+1;
		while(i<s.length()) {
			if(flag) {
				if(j>=s.length()) {
					
				}
				else {
					s1=s1+s.charAt(i)+s.charAt(j);
				}
				
			}
		}
	}
}
