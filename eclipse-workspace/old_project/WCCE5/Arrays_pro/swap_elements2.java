package Arrays_pro;

import java.util.Arrays;

public class swap_elements2 {
	public static void main(String[] args) {
		int arr[] = {3,2,1,5,6,8};
		boolean flag=true;		
		int j=0;
		int iter=1;
		int temp=arr[0];
		while(iter<=6) {
			if(flag) {
				if(j<arr.length-1) {
					arr[j]=arr[j+1];
					j++;
				}
				else {
					arr[arr.length-1]=temp;
					iter++;
					j=0;
					temp=arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
