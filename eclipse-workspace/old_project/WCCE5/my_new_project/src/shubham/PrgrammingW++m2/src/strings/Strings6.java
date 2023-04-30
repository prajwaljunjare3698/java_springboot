package strings;

import java.util.Scanner;

public class Strings6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String st =s.nextLine();
		char ch[]= st.toCharArray();
		String st1 ="";
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0&&ch [i]!=' ')
			{
				i--;
			}
			int  j= i+1;
			while(j<=k)
			{
			 st1= st1+ch[j];
			 j++;
			}
			st1= st1+' ';
		}
		System.out.println(st1);
	}

}
