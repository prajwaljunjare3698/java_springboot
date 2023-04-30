package patterns;

public class first {
	public static void main(String[] args) {
		char c='a';
		int a=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=5;k>=i;k--) {
				if(i%2==1) {
					System.out.print(a+" ");
				}
				else {
					System.out.print(c+" ");
				}				
			}
			if(i%2==1) {
				a++;
			}
			else {
				c++;
			}			
			System.out.println();
		}
	}		
}
