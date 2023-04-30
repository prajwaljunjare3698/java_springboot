package strings;

import java.util.Scanner;

public class String12 {
	public static void main(String[] args) {
	Scanner s = new	Scanner(System.in);
	System.out.println("Enter the string");
	String s1 = s.nextLine();
	char []ch=s1.toCharArray();
	for(int i =0;i<ch.length;i++)
	{
		if(i==0||ch[i-1]==' '&&ch[i]!=' ')
		{
			if(ch[i]>=97&&ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
			
			else if(ch[i]>=65&&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]-32);
			}
			
		}
	}
		s1= new String(ch);
		System.out.println(ch); // array format
		System.out.println(s1); // string format
		}
	}



