package strings;

import java.util.Scanner;

public class String10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the password");
		String pwd = s.next();
		int uppercase=0;
	    int lowercase=0;
	    int digit=0;
	    int splcharacter=0;
	    char ch;
	    for(int i =0;i<pwd.length();i++)
	    {
	    	ch=pwd.charAt(i);
	    	if(ch>='A'&& ch<='Z')
	    		uppercase++;
	    	else if(ch>='a'&& ch<='z')
	    		lowercase++;
	    	else if(ch>='0'&& ch<='9')
	    		digit++;
	    	else
	    		splcharacter++;
	    }
	    if(pwd.length()>=8&&uppercase>0&&lowercase>0&&digit>0&&splcharacter>0)
	    {
	     System.out.println("Enter a valid passoword");
	    }
	    else
	    {
	    	System.out.println("Enter a invalid pssword");
	    }
	    }
	}


