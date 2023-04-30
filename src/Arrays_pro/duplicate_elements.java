package Arrays_pro;

public class duplicate_elements {
	public static void main(String[] args) {
//		int arr[] = {1,2,3,1,5,3,1,2,2,3};
//		for(int i=0;i<arr.length;i++) {
//			int count=0;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			if(count==0) {
//				System.out.println(arr[i]);
//			}
//		}
		int numRay[] = {0,1,2,3,2,1,5,6,2,3,1,1};
		  
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]
                = numRay[numRay[i] % numRay.length]
                  + numRay.length;
            System.out.println(numRay[i]);
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
	}
}		
