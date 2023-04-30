package String_pro;

public class most_frequent_char {
	public static void main(String[] args) {
		String s = "122111";		
		int first=0;
		int second=0;
		char se=0;
		char c=0;
		char equal=0;
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>first) {
				first=count;
				c=s.charAt(i);
			}
			if(count==first) {
				equal=s.charAt(i);
			}
			if(count<first) {
				second=first;
				se = s.charAt(i);
			}
			
		}
		//System.out.println(c);
		System.out.println(se);
	}
}
