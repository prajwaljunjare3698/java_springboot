package com.programs;

public class simple {
	public static void main(String[] args) {
	//I love my country india
//	i.e. "india country my love I"
	
	 String s = "I love my country india";
	 String[]arr = s.split(" ");
	 for(int i=arr.length-1;i>=0;i--) {
		 System.out.print(arr[i]+" ");
	 }

	}
}
