package String_pro;

public class combinations_of_string {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = "";
		boolean flag=true;
		int i=0;
		int j=0;	
		int iter = 1;
		int count=0;
		int loop=1;
		while(iter<=6) {
			if(iter==3) {
				loop++;		
			}			
			if(flag) {
				if(i!=j) {
					if(s.length()==s1.length()) {
						System.out.println(s1);
						j=0;
						s1="";
						flag=false;
						count=0;
					}
					else {
						if(count==0) {
							s1=s1+s.charAt(i)+s.charAt(j);
							count++;
						}
						else {
							s1=s1+s.charAt(j);
						}
						iter++;
					}					
				}
				j++;				
			}
			else if(!flag) {
				iter=1;
				j=s.length();
				if(i!=j) {
					if(s.length()==s1.length()) {
						flag=true;
						j=0;
						s1="";
						System.out.println(s1);
					}
					else {
						if(count==0) {
							s1=s1+s.charAt(i)+s.charAt(j);
							count++;
						}
						else {
							s1=s1+s.charAt(j-1);	
						}											
					}					
				}
			}			
		} 
	}
}
