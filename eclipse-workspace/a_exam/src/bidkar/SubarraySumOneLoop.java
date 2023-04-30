package bidkar;

public class SubarraySumOneLoop {
//	Write a function that returns all sets of three elements that sum to 1.
//	Examples
//	sumFunction([0, 1, -1, -1, 2]) ➞ [[0, -1, 2]]
//	sumFunction([0, 1, 2, -1, -3,-2]) ➞ [[0, 2, -1], [1, 2, -2]]
//	sumFunction([1, 2, 3]) ➞ []
//	sumFunction([1]) ➞ []
	public static void main(String[] args) {
		int arr[] = {0, 1, 2, -1, -3,-2};
		int i = 0;
		int j = i+1;
		int k = j+1;
		while(i<arr.length) {		
			if(j<arr.length) {
				if(k<arr.length) {
					if(arr[i]+arr[j]+arr[k]==1) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);						
					}
					k++;
				}
				else {
					j++;
					k = j+1;
				}
			}
			else {
				i++;
				j = i+1;
				k = j+1;
			}				
			
		}
//		while(i<arr.length) {
//			if(flag) {
//				if(j<arr.length) {
//					if(k<arr.length) {
//						if(arr[i]+arr[j]+arr[k]==1) {
//							System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);						
//						}
//						k++;
//					}
//					else {
//						flag = false;
//					}
//				}
//				else {
//					i++;
//					j = i+1;
//					k = j+1;
//				}				
//			}
//			else {
//				j++;
//				k = j+1;			
//				flag = true;
//			}
//		}
	}
}
