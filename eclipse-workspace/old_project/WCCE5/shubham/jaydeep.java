package shubham;
import java.util.Scanner;
//
//wajp to read m and n as a character print only vowels
//23. wajp to read m and n print count of vowels
//24. wajp to read m and n print consonant
//25. wajp to read m and n print count of consonant

public class jaydeep {
	public static void main(String[] args) {
	//answer->24
		Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        int a = c1;
        char c2 = sc.next().charAt(0);
        int b = c2;
        
        int sum=0;
         for(int i=a;i<=b;i++){
             char c3 = (char)i;
             if(c3!='a' && c3!='e' && c3!='i' && c3!='o' && c3!='u'){
                 System.out.println(c3);
            	 sum=sum+1;
             }
         }
         System.out.println(sum);
	}
}
