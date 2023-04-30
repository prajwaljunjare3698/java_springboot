package Arrays_pro;

public class second_max {
	
	// Not done yet....
	public static void main(String[] args) {
		int arr[] = {5,4,3,6,7,6,6,6};
		int max1 = arr[0];
		int max2 = 0;
		for(int i=1;i<=2;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>max1) {
					max2 = max1;
					max1 = arr[i];
				}  
			}			
		}
		System.out.println(max2);
	}
}
