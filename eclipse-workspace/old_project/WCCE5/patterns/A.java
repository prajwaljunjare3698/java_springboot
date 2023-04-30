package patterns;
//× × × × ×
//× 3 4 5 6 ×
//× 4 5 6 7 ×
//× 5 6 7 8 ×
//× × × ×  ×
public class A {
	public static void main(String[] args) {
		int n=5;
		int i=1;
		int j=1;
		int k=1;
		int l=n-1;
		while(true) {
			if(i==1 || i==n) {
				if(j<=5) {
					System.out.print("*");
					j++;
				}
			}
			else {
				System.out.println();
				if(k==1 || k==n) {
					System.out.print("*");
					k++;
				}
				else {
					System.out.print(l++);
				}
			}	
			i++;
			if(i==n) {
				break;
			}
			
			
		}
		
		
		
		
//		int a = n-1;
//		for(int i=1;i<=n;i++) {
//			if(i==1 || i==n) {
//				for(int j=1;j<=n;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			else {		
//				int b = a;
//				for(int k=1;k<=6;k++) {
//					if(k==1 || k==6) {
//						System.out.print("*");
//					}
//					else {
//						System.out.print(b++);
//					}
//				}
//				System.out.println();
//				a++;
//				
//			}
//		}
	}
}
