package strings;

import java.util.Scanner;

public class Stirng8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String st =s.nextLine();
		char ch[]= st.toCharArray();
		String st1 ="";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int  j= i-1;
			while(k<=j)
			{
			 st1= st1+ch[j];
			 j--;
			}
			st1= st1+' ';
		}
		System.out.println(st1);
	}
 // palandrome

}
