package String_pro;

public class anagram {
	public static void main(String[] args) {
		String s1="aab";
		String s2="bba";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					count++;
					break;
				}
			}
		}
		if(count==s1.length()) {
			System.out.println("anagram");
		}
		else {
			System.out.println("Not");
		}
	}
}
