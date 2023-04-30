package String_pro;

public class cyclic_string {
	public static void main(String[] args) {
		String s1 = "prajwal";
		String s2 = "jwalpra";
		String s3 = "";		
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<=s1.length()+i;j++) {
				if(j>=s1.length()) {
					s3=s3+s1.charAt(j-s1.length());
				}
				else {
					s3=s3+s1.charAt(j);
				}
			}
			System.out.println(s3);
			if(s2.equals(s3)) {
				System.out.println("cyclic ");
				break;
			}
			else {
				s3="";
				//System.out.println("no");
				
			}			
		}
	}
}
