package Practice;

public class no_pattern7 {
	public static void main(String[] args) {
		String s = "      ";
		String r = "";
		for(int i=5; i>=1; i--) {
			r = s.substring(0, i);
			System.out.print(s);
			for(int k=i; k<=5; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
