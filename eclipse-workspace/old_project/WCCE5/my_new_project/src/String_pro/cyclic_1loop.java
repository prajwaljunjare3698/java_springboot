package String_pro;

public class cyclic_1loop {
	public static void main(String[] args) {
		String s1= "prajwal";
		String s2 = "jwalhpra";
		String s3 = "";
		int i=0;
		int j=i+1;
		boolean flag=true;
		int count=0;
		while(i<s1.length()) {
			if(j<=s1.length()+i) {
				if(j<s1.length()) {
					s3=s3+s1.charAt(j);
					j++;
				}
				else {
					s3=s3+s1.charAt(j-s1.length());
					j++;
				}
				//System.out.println(s3);
			}
			else {
				i++;
				j=i+1;
				s3="";
			}
			if(s2.equals(s3)) {
				System.out.println("cyclic");
				 count++;
				break;
			}
		}
		if(count==0){
			System.out.println("not");
		}
	}
}
