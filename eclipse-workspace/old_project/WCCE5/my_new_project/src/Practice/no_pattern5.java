package Practice;
public class no_pattern5 {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			int count=0;
				for(int j=1; j<=i; j++) {
					System.out.print(j);
					count++;
				}
				System.out.println();
			
			if(count==3) {
				int m=count;
				for(int k=1; k<=m; k++) {
					System.out.print(k);
					m--;
				}
				System.out.println();
				System.out.print(m);
			}			
		}
	}
}
//1
//12
//123
//12
//1
