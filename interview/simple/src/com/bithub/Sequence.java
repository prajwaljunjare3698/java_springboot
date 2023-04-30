package com.bithub;

import java.util.Arrays;

public class Sequence {
	public static void main(String[] args) {
		//shift all 0 to starting of arr
		int[]arr = {1,4,0,2,0,8 };    
		int ind=0;
        int i,temp,j;
        for(i=1; i<arr.length; i++){
            if(arr[i] == 0){
                for(j=i;j>ind;j--){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                ind++;
            }
        }
        System.out.println(Arrays.toString(arr));
    } 
}
  