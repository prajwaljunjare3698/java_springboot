package Arrays_pro;

public class scond_larg_no {
	public static void main(String[] args) {
		int arr[] = {3,2,1,21,76,54,99,67,12,5,4};
		int max = arr[0];
		int max2 = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max2=max;
				max=arr[i];
			}
			if(arr[i]>max2 && arr[i]!=max) {
				max2 = arr[i];
			}
		}
		System.out.println(max+" "+max2);
	}
}
