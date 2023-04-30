package Arrays_pro;
import java.util.Arrays;
public class search{
	public static void main(String[] args) {
		int arr[] = {5,4,2,7,8,9};
		int arr1[] = {23,1,4,5,6,8};
		System.out.println(Arrays.binarySearch(arr, 8));//4
		
		//print array in one line use Arrays.toString(arr)
		System.out.println(Arrays.toString(arr));
		
		//equals or not
		System.out.println(Arrays.equals(arr, arr1));
		
		//to copy array from one to another		
		int arr3[]=arr.clone();
		System.out.println(Arrays.toString(arr3));
		
		//using arr.Arrays.copyOf(arr);
		int arr4[]=Arrays.copyOf(arr3, 10);
		System.out.println(Arrays.toString(arr4));
	}
}
