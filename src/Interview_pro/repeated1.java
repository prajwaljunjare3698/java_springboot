package Interview_pro;
import java.util.*;
public class repeated1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String str =sc.nextLine();
		System.out.println(check(str));
	}
	public static boolean check(String str) {
		str=str.replaceAll("\\s+","");
		
		String s = "";
		for(int i=0;i<str.length();i++) {
			s = str.charAt(i)+s;					
		}
		System.out.println(str);
		System.out.println(s);
		if(str.equals(s)) {
			return true;
		}
		return false;
	}
}
