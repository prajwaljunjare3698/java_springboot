package String_pro;

public class get_no {
	public static void main(String[] args) {
		String s = "abc12kd ,9llbvsgsgss*&x.%yossaaddlp";
		String s1 = "";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				int count=0;
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
					}
				}
				if(count==0) {
					s1=s1+s.charAt(i);
				}
			}
		}
		System.out.println(s1);
	}
}
