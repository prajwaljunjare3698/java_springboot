package shubham;

public class pair_arr {
	public static void main(String[] args) {
		int arr[] = {1,3,2,43,2,4,5,1,1,6,5,43,2,3,2};		
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>2) {
				System.out.println(arr[i]);
			}
		}
	}
}
