package patterns;

public class first3 {
	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				if(i%2==1) {
					System.out.print(a++ +" ");
				}
				else {
					System.out.print(" ");
					a++;
				}
			}
			System.out.println();
		}		
	}
}
//1 2 3 4 5 
//
//10 11 12 
//  
//15 

