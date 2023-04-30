package Arrays_pro;

import Collection.min_max_list;
//find each element comes how many times
public class repeated_no {
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1,2,34};
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j] = 0;
				}
			}
			if(arr[i]!=0) {
				
				System.out.println(arr[i]+"="+count);
			}
		}
	}
}
