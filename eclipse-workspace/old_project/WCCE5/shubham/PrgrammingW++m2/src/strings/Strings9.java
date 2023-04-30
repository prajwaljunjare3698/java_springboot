package strings;

import java.util.Scanner;

public class Strings9 {
public static void main(String[] args) {
	Scanner s  = new Scanner(System.in);
	System.out.println("Enter a String");
	String st =s.next();
	char ch[]=st.toCharArray();
	int count =0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>=97&&ch[i]<=122 ||ch[i]>=65&&ch[i]>=90||ch[i]>=48&&ch[i]<=57&& ch[i]!=32&&ch[i]!=','&&ch[i]!='.')
			count++;
	}
	System.out.println("The number characters is: "+count);
}
}
