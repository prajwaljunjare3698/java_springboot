package Interview_pro;

import java.util.Arrays;

//Input Array :  2,4,8,5,12,15,6,10,7,30,25,43,46,45,21
//Output Array :  2,4,8,21,12,46,6,43 ,7,30,25,10,15,45,5

//Assignment 1. part I
// answer ->

public class multiple_of_5_second {
	public static void main(String[] args) {
		int arr[] = {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
		boolean flag=true;
		int i=0;
		int j=i;
		int temp=0;
		int count=0;
		int rev = arr.length-1;
		while(i<arr.length-count) {
			if(flag) {
				if(arr[i]%5==0) {
					count++;
					temp=arr[i];
					flag=false;
				}
				else {
					i++;
				}
			}
			if(!flag) {
				if(arr[rev]%5==0) {
					rev--;
					count++;
				}
				else {
					arr[i]=arr[rev];
					arr[rev]=temp;
					flag=true;
					i++;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
