package patterns;

public class first8 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int a=i;
			int b=1;
			for(int j=1;j<=5;j++) {
				if(a>5) {
					System.out.print(b++);
				}
				else {
					System.out.print(a++);
				}
			}
			System.out.println();
		}
	}
}
