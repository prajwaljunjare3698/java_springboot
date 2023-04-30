package strings;

import java.util.Scanner;

public class Stirngs11 {

	static String one[]= {"","one","two","three","four ","five","six","nineteen",};
	static String two[]= {"","","twenty","thirty" ,"ninety"};
	public static void numtoword(int n,String s1)
	{
		if(n<=7)
			System.out.println(one[n]+" ");
		else
			System.out.println(two[n/10]+one[n%10]);
		if(n!=0)
			System.out.println(s1+"");
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		numtoword(num%100, "");
		numtoword((num/100)%10, "Hunbred");
		numtoword((num/1000)%100, "Thousand");
		numtoword((num/100000)%100, "lakhs");
		numtoword(num/10000000, "crores");
		
		
	}
}
