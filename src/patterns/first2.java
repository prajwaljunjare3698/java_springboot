package patterns;

public class first2 {
	public static void main(String[] args) {
		char c='a';
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--) {
				System.out.print(c++);
			}
			System.out.println();
		}
	}
}
//abcde
//fghi
//jkl
//mn
//o
