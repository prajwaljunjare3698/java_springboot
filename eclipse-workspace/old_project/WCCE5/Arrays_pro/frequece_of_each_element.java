package Arrays_pro;
public class frequece_of_each_element {
	public static void main(String[] args) {
//		int arr[] = {1,2,8,1,3,3,2,6};	
//		int arr1[] = new int[arr.length];
//		int ind=0;
//		for(int i=0;i<arr.length;i++) {
//			boolean flag=true;
//			int temp = 0;
//			for(int j=0;j<arr1.length;j++) {
//				if(arr[i]==arr1[j])	{
//					temp=1;
//					flag=false;
//				}
//			}
//			if(temp==0) {
//				arr1[ind]=arr[i];
//				ind++;
//			}
//			if(flag) {
//				int count=1;
//				for(int k=0;k<arr.length;k++) {
//					if(i!=k) {						
//						if(arr[i]==arr[k]) {
//							count++;
//						}
//					}
//				}
//				System.out.println(arr[i]+" comes "+count+" times");
//			}
//		}
		int arr[] = {1,2,8,1,3,3,2,6};	
		int arr1[] = new int[arr.length];
		int i=0;
		boolean flag=true;
		int len = (arr.length-1)*2;
		while(true) {
			if(flag) {
				if(i<=arr.length-1) {
					System.out.print(arr[i]+" ");
					i++;
				}
				else {					
					flag=false;
					System.out.println();
				}
			}
			if(!flag) {				
					i--;
					if(i==0) {
						System.out.print(arr[i]+" ");
						break;
					}
					System.out.print(arr[i]+" ");
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
