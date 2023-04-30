package temp;

public class MaxOcuur {
	public static void main(String[] args) {
		String s = "abcabcacdab";
		
		int first = 0;
		char c=' ';
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}
			if(count>first) {
				first = count;
				c = s.charAt(i);
			}			
		}
		System.out.println(c);
		System.out.println(first);
	}
}	
