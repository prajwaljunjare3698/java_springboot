package Practice;

public class no_pattern4 {
	public static void main(String[] args) {
		String s = "     ";
		for(int i=5; i>=1; i--) {
			System.out.print(s);
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
