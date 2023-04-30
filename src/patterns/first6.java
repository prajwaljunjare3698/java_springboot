package patterns;

public class first6 {
	public static void main(String[] args) {
		int a=1;
		char c='a';
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				if(j%2==0) {
					System.out.print(c++ +" ");
				}
				else {
					System.out.print(a++ +" ");
				}				
			}
			System.out.println();
		}
	}
}
//1 a 2 b 3 
//4 c 5 d 
//6 e 7 
//8 f 
//9 
//
