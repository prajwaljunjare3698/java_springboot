package Practice;
import java.util.Scanner;

public class repeated_char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.next();
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int k = 0; k < s1.length(); k++) {
				if (s.charAt(i) != s1.charAt(k)) {
					for (int j = i + 1; j < s.length(); j++) {
						if (s.charAt(i) == s.charAt(j)) {
							s1 = s1 + s.charAt(i);
							count++;
						}
					}
				}
			}
			System.out.println(s.charAt(i)+" comes in "+count);
		}
		System.out.println("hii");
	}
}
