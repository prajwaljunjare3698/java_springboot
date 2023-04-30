package String_pro;

public class String_to_array {
	public static void main(String[] args) {
		String s="String_builder";
		char c[]=s.toCharArray();
		//System.out.println(c);	//String_Builder
		for(char ch:c) {
			System.out.println(ch);
		}
	}
}
