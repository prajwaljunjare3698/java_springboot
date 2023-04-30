package shubham;

public class second_max {
	public static void main(String[] args) {
		int arr[] = {2,3,1,6,7,4};
		int first = arr[0];
		int second = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			if(arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
		}
		System.out.println(second);
	}
}
