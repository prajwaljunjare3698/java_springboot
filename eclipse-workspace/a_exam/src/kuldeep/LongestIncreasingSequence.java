package kuldeep;

public class LongestIncreasingSequence {
	public static void main(String[] args) {
		int arr[] = {10,7,5,4,3};
		System.out.println(lis(arr,arr.length));
		
	}
	public static int lis(int arr[],int n) {
		int first = 0;
		int second = 0;
		
		for(int i=0;i<arr.length;i++) {
			int longest = 1;
			first = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(first<arr[j]) {
					first = arr[j];
					longest++;
				}
			}
			first = longest;
			if(first>second) {
				second = first;
			}
		}
		return second;
	}
}
