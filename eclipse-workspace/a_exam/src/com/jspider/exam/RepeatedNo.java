package com.jspider.exam;

public class RepeatedNo {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,7,2,3,2,4,3,2,1,2,2,2,6};
		
        for(int j=0;j<arr.length;j++) {
        	int count=0;
            for(int k =j+1;k<arr.length;k++) {
                if(arr[j]==arr[k]) {
                    count++;
                }
            }
            if(count==1)
               System.out.println(arr[j]);            
        }
	}
}
