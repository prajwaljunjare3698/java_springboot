package timedateAPI;

public class Jag {
	public static void main(String[] args) {
		String s = "hi my nam is akash";
		String main = "";
		
		String word = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word = word+s.charAt(i);
			}
			else {
					main = " "+word + main;
					word = "";
			}
			System.out.println(word);
		}
		System.out.println(main);
			
	}
}
