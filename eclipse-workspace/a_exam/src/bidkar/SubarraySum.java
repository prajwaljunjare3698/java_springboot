package bidkar;

public class SubarraySum {
//	Write a function that returns all sets of three elements that sum to 1.
//	Examples
//	sumFunction([0, 1, -1, -1, 2]) ➞ [[0, -1, 2]]
//	sumFunction([0, 1, 2, -1, -3,-2]) ➞ [[0, 2, -1], [1, 2, -2]]
//	sumFunction([1, 2, 3]) ➞ []
//	sumFunction([1]) ➞ []
	public static void main(String[] args) {
		int arr[] = {0, 1,-2};
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==1) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
					}
				}
			}
		}
		if(count==0) {
			System.out.println("[]");
		}
	}
}
