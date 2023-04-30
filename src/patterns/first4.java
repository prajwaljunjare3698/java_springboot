package patterns;

public class first4 {
	public static void main(String[] args) {
		int a=1;
		char c='a';
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				if(i%2==1) {
					System.out.print(a++ +" ");
				}
				else {
					System.out.print(c++ +" ");
				}
			}
			System.out.println();
		}
	}
}
//1 2 3 4 5 
//a b c d 
//6 7 8 
//e f 
//9 

