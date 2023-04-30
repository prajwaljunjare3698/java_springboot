package String_pro;

//replace '?' by correct character that will make string palindrom

public class palindrome1 {
	public static void main(String[] args) {
		String s = "a?na";		//anna,madam,malayalam,racecar
		String s1 = "";
		String s2 = "";
		boolean flag=true;
		int a = 97;
		int i=0;
		while(true) {
			char c = (char)a;
			if(flag) {
				if(i<s.length()) {
					if(s.charAt(i)=='?'){	
						s1=s1+c;
					}
					else {
						s1=s1+s.charAt(i);
					}
					i++;
				}
				else {
					i--;
					flag=false;
				}
			}				
			else {
				if(i==0) {
					s2=s2+s1.charAt(i);
					flag=true;
				}
				else {
					s2=s2+s1.charAt(i);
				}
				i--;
				if(flag) {
					i++;
				}
			}
			if(s1.equals(s2)) {
				System.out.println("made palidrom by "+c);
			}
			else {
				if(c=='z') {
					System.out.println("not made");
					break;
				}
			}
			s1="";
			s2="";
		}
		System.out.println(s1);
		System.out.println(s2);
		
		
//		for(int a=97;a<=122;a++) {
//			char c = (char)a;
//			for(int i=0;i<s.length();i++) {
//				if(s.charAt(i)=='?') {
//					s1=c+s1;
//					s2=s2+c;
//				}
//				else {
//					s1=s.charAt(i)+s1;
//					s2=s2+s.charAt(i);
//				}
//			}
////			System.out.println(s1);
////			System.out.println(s2);
//			if(s1.equals(s2)) {
//				System.out.println("made palindrom by "+c);
//				flag=false;
//				break;
//			}
//			
//			s1="";
//			s2="";
//		}
//		if(flag) {
//			System.out.println("not ");
//		}
	}
}
