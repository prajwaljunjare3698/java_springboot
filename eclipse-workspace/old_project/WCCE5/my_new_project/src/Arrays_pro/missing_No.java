package Arrays_pro;
//missing no from array(only if array contain 1 and incresing....
public class missing_No {
	public static void main(String[] args) {
		int arr[] = {2,3,5,6,1,7,8,9,10,11,15,14,13,12};
		int sum_arr=0;
		int sum_no=0;
		
		//by using sum_of_no formula
		//int sum_no = (arr.length+1)*(arr.length+1+1)/2;
		//sum_no=(arr.length+1)*(arr.length+1+1)/2;
//		for(int i=0;i<arr.length;i++) {
//			sum_arr+=arr[i];
//			
//		}
		//System.out.println(sum_no-sum_array);
		int k=1;
		for(int i=0;i<arr.length;i++) {
			sum_arr=sum_arr^arr[i];
			sum_no=sum_no^k++;
		}
		sum_no^=k;
		System.out.println(sum_arr);
		System.out.println(sum_no);
		System.out.println(sum_no^sum_arr);
	}
}
