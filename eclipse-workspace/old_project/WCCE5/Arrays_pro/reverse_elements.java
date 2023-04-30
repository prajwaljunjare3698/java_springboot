package Arrays_pro;

import java.util.Arrays;

public class reverse_elements {
	public static void main(String[] args) {
		int arr[] = {5,3,4,6,7,8,2,1};
//        int i = 0;
//        int j = arr.length - 1;
//        while(i < j) {
//            //swapping ith and jth index elements
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<arr.length/2;i++) {
        	int temp = arr[i];
        	arr[i]=arr[arr.length-i-1];
        	arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
	}
}
