package Interview_pro;

public class mar_occur_char {
	public static void main(String[] args) {
		String s = "abafdaaddfbadds";
		boolean flag = true;
		int i=0;
		char ch = 0;
		int j=i+1;
		int count=1;
		int max = 0;
		char ch2 = 0;
		while(i<s.length()) {
			if(flag) {
				if(j<s.length()) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
					}
					j++;
				}
				else {
					if(count>max) {
						max = count;
						ch = s.charAt(i);
					}
					if(count==max) {
						ch2 = s.charAt(i);
					}
					i++;
					count=1;
					j=i+1;
				}
			}
		}
		System.out.println(ch+" "+ch2);
	}
}
