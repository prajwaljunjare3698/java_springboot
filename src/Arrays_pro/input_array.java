package Arrays_pro;

import java.util.Arrays;
import java.util.Scanner;

public class input_array {
	public static void main(String[] args) {
		int size1 = 2;
        int size2 = 2;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[size1][size2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int a = sc.nextInt();
                arr[i][j]=a;
            }
        }
        System.out.println(arr[1][0]);
        System.out.print(Arrays.toString(arr));	//will display only adress
	}
}
