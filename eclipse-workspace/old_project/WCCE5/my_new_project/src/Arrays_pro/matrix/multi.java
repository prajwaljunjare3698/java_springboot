package Arrays_pro.matrix;

import java.util.Arrays;

public class multi {
	public static void main(String[] args) {
		
		//perform the multiplication of matrix
		
		int a[]= {1,2,3,4};
		int b[]= {4,3,2,1};		
		for(int i=0;i<a.length;i++) {
			
		}
		
		int rand = (int)(Math.random()*(7-1+1));
		System.out.println(rand);
		System.out.println(Math.min(2, 3));
		System.out.println(Math.multiplyExact(2, 4));
		
		//int c[]=a.clone();
		//int c[]=Arrays.copyOf(a[],int);
		//System.out.println(Arrays.toString(c));
		check(a);
	}
	public static void check(int...s) {
		int sum=0;
		for(int i=0;i<s.length;i++) {
			sum+=s[i];
		}
		System.out.println(sum);
	}
}
