package Practice;

import java.util.Arrays;

public class end_0 {
	public static void main(String[] args) {
		int arr[] = {3,2,0,7,6,0,1,4};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				int temp = arr[i];
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				arr[arr.length-1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));		
	}
}
