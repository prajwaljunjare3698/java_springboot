package Interview_pro;

public class subarray1 {
	public static void main(String[] args) {
		int arr[] = {3,6,1,1,6};
		int val=2;
		int max1=0;
		int max2=0;
		int first=0;
		int second=0;
		int third=0;
		int fourth=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]>max1) {
					first=arr[i];
					second=arr[j];
					System.out.println(first);
				}
			}
			for(int k=0;k<arr.length;k++) {
				for(int l=k+1;l<arr.length;l++) {
					if(max2<arr[k]+arr[l]) {
						third=arr[k];
						fourth=arr[l];
					}
				}
			}
		}
		System.out.println(first+""+second+""+third);
	}
}
