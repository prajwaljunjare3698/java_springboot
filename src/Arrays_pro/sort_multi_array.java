package Arrays_pro;
import java.util.Arrays;
	//sort Multidimensional array without sort method 
public class sort_multi_array {
	public static void main(String[] args) {
		int arr[][] = {{3,2,0,-4,-9,4,6,1},{7,5,0,-6,9,3},{5,4,-2,4,-1,-3}};
		int i=0;
		int j=0;
		int k=j+1;
		boolean flag=true;
		while(i<arr.length) {
			if(j<arr[i].length) {
				if(k<arr[i].length) {
					if(arr[i][j]>arr[i][k]) {
						int temp = arr[i][j];
						arr[i][j]=arr[i][k];
						arr[i][k]=temp;
					}
					k++;
				}
				else {
					j++;
					k=j+1;
				}
			}
			else {
				i++;
				j=0;
				k=j+1;
			}			
		}		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
	}
}
