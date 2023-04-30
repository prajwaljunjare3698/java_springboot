package patterns;

public class first7 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			if(i==1 || i==6) {
				for(int j=1;j<=6;j++) {
					System.out.print("*");
				}
			}
			else {
				int a=i-1;
				int b=1;
				for(int k=1;k<=6;k++) {
					if(k==1 || k==6) {
						System.out.print("*");
					}
					else {
						if(a>5) {
							System.out.print(b++);
						}
						else {
							System.out.print(a++);
						}
					}					
				}
			}
			System.out.println();
		}
	}
}
