package Interview_pro;

import java.util.Arrays;
import java.util.Scanner;

//Input Array :  2,4,8,5,12,15,6,10,7,30,25,43,46,45,21
//Output Array :  2,4,8, 12, 6, 7, 43,46,21, 5,15,10,30,25,45

//Assignment 1. part I
// answer ->
public class multiple_of_5 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("enter length of array");
		    int len = sc.nextInt();
		    int arr[] = new int[len];
		    for(int i=0;i<len;i++){
		        arr[i]=sc.nextInt();
		    }
		//int arr[] = {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
		boolean flag=true;
		int i=0;
		int j=0;
		int temp=0;
		int count=0;
		while(i<arr.length-count) {
			if(flag) {
				if(arr[i]%5==0) {
					count++;
					flag=false;
					j=i;
					temp = arr[j];
				}
				else {
					i++;
				}
			}
			if(!flag) {
				if(j<arr.length-1) {
					arr[j] = arr[j+1];
					j++;
				}
				else {
					arr[arr.length-1]=temp;
					j=0;
					flag=true;
					//System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}	
