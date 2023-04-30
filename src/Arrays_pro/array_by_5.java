package Arrays_pro;

//using Arrays package for using toSting() method to show array in one line
import java.util.Arrays;

//2,4,8,5,12,15,6,10,7,30,25,43,46,45,21
//2,4,8, 12, 6, 7, 43,46,21, 5,15,10,30,25,45
public class array_by_5 {
	public static void main(String[] args) {
		int arr[] = {2,4,8,5,12,15,6,10,7,30,25,43,46,45,21};
		boolean flag=true;		
		int j=0;
		int iter=1;
		int temp=arr[0];
		boolean sw = false;
		while(iter<arr.length) {
			if(flag) {
				if(j<arr.length-1) {
					if(arr[j]%5==0) {
						sw=true;
					}
					if(sw) {
						arr[j]=arr[j+1];
						j++;
					}
					else {
						j++;
					}
				}
				else {
					arr[arr.length-1]=temp;
					iter++;
					j=0;
					temp=arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
