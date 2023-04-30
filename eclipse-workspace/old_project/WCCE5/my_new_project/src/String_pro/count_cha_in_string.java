package String_pro;
//count the char how many time it comes in string
public class count_cha_in_string {
	public static void main(String[] args) {
		String s = "abbaaabdbddbdjdbdbjdbdjbdjbjdbjdbbdjbda";
		String s1 = "";
		boolean flag=true;
		int count=1;
		int i=0;
		int j=i+1;
		int k=0;
		while(i<s.length()) {
			if(flag) {
				if(k<s1.length()) {
					if(s.charAt(i)==s1.charAt(k)) {
						i++;
						j=i+1;
						k=0;
					}
					else {
						k++;
					}
				}
				else{
					k=0;
					s1=s1+s.charAt(i);
					//System.out.println(s1);
					flag=false;
				}
			}
			if(!flag) {
				if(j<s.length()) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
					}
					j++;
				}
				else {
					System.out.println(s.charAt(i)+" comes "+count);
					i++;
					j=i+1;
					flag=true;
					count=1;
				}
			}
		}
		//System.out.println(s1);
	}
}
