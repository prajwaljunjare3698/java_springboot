package strings;

import java.util.Scanner;

public class String5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = s.next();
	    int uppercase=0;
	    int lowercase=0;
	    int digit=0;
	    int splcharacter=0;
	    char ch;
	    for(int i =0;i<s1.length();i++)
	    {
	    	ch=s1.charAt(i);
	    	if(ch>='A'&& ch<='Z')
	    		uppercase++;
	    	else if(ch>='a'&& ch<='z')
	    		lowercase++;
	    	else if(ch>='0'&& ch<='9')
	    		digit++;
	    	else
	    		splcharacter++;
	    }
	    System.out.println("Number of uppercase :"+uppercase);
	    System.out.println("Number of lowercase :"+lowercase);
	    System.out.println("Number of digit :"+digit);
	    System.out.println("Number of splcharacter :"+splcharacter);
	}

}
