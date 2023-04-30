package com.jspider.jsp;

public class PassGenerator {

	public static void main(String[] args) {
		
		int arr1[] = {97,123};
		int arr2[] = {49,57};
		int arr3[] = {35,36,37,38};
		
		String pass = "";
		
		for(int i=1;i<=2;i++) {
			
			double first = Math.random() * (arr1[1] - arr1[0] + 1) + arr1[0];  
			int a = (int)first;
			
			double second = Math.random() * (arr2[1] - arr2[0] + 1) + arr2[0];  
			int b = (int)second;
			
			double third = Math.random() * (arr3[3] - arr3[0] + 1) + arr3[0];  
			int c = (int)third;			
			
			char c1 = (char) a;
			char c2 = (char) b;
			char c3 = (char) c;
				
			pass = pass+c1+c2+c3;
		}
		System.out.println(pass);
	}
}
