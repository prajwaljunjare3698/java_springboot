package patterns;

public class first5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int a=1;
			for(int j=5;j>=i;j--) {
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println();
		}
	}
}
//1 3 5 7 9 
//1 3 5 7 
//1 3 5 
//1 3 
//1 
