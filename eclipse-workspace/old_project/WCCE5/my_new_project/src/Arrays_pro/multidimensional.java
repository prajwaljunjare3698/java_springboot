package Arrays_pro;

import java.util.Arrays;

public class multidimensional {
	public static void main(String[] args) {
		int arr[][] = {{3,4,2},{7,6,5,4,9}};
		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr[i]);
			Arrays.sort(arr[i]);
		}
		
//		int arr2[]= {};
//		int k=0;
//		for(int i=0;i<arr.length;i++) {
//			arr2 = new int[arr[i].length];
//			for(int j=0;j<arr[i].length;j++) {
//				arr2[k]=arr[i][j];
//			}
//		}
		 
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
	}
}
