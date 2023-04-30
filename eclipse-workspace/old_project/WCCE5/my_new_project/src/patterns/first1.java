package patterns;

public class first1 {
//	 01010
//	  0101
//	   010
//	    01
//	     0

	public static void main(String[] args) {
		int a=0;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
//				if(a==0) {
//					System.out.print(a);
//					a=1;
//				}
//				else {
//					System.out.print(a);
//					a=0;
//				}
				System.out.print((j+1)%2);
			}
			System.out.println();
		}
	}
}
