package strings;

import java.util.Scanner;

public class Strings7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a alphanumeric");
		String st = s.nextLine();
		char []ch=st.toCharArray();
		int j=0;
		//count =0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
             { 
            	 j+=ch[i]-48;
            	 //count++;
             }
		}
		System.out.println(j);
	}

}
