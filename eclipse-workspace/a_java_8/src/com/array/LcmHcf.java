package com.array;

public class LcmHcf {
	 public static void main(String[] args) {
	    int a = 8,b = 12;
	    int max = (a>b)?a:b;
	    int lcm = 0;
	    //finding lcm
	    for(int i=max;i<a*b;i++){
	        if(i%a==0 && i%b==0){
	            lcm = i;
	            break;
	        }
	    }
	    System.out.println(lcm);	    
	    
	    //finding hcf
	    for(int i=a;i>=1;i--){
	        if(a%i==0 && b%i==0){
	            System.out.println(i);
	            break;
	        }
	    }
	    int hcf = (a*b)/lcm;
	    System.out.println(hcf);
	}
}
