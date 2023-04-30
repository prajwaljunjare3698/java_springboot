package Arrays_pro;

import java.util.Scanner;

public class rev_in_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//getting size of array
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		//using for loop for getting required size elements in array 
		for(int value=0;value<size;value++) {
			arr[value]=sc.nextInt();
		}
		
		//declaring variable as per usage
		int i=0;	//for iterating all elements
		int j=0;	//for checking the reverese no in array
		int count=0;//for couting the total rev nos
		int rev=0;	//for rev the single element
		int temp;	//for storing array element and 
		boolean flag=true;	
		temp=arr[i];
		
		//now iterating elements one by one
		while(i<arr.length) {			
			if(flag) {
				
				//following instructions used to get reverse of element
				if(temp>0) {
					int mod=temp%10;
					rev = rev*10+mod;
					temp=temp/10;
				}
				
				//if element is like same like 55,44,11 then skip the element
				else if(arr[i]==rev) {
					i++;
				}
				
				//after getting the rev of element now do flag false
				//so it dont go inside the reverse instruction statements
				else {
					flag=false;
				}
			}
			
			//while flag is false
			//then only check the reverse of the element is present in array or not
			else {
				if(j<arr.length) {
					
					//if rev of element present then increment count
					if(rev==arr[j]) {
						count++;
					}
					
					//check every elements in array by increamenting j
					j++;
				}
				
				//while j will greater than length of array then 
				//start from beggining(just increment i)
				//again declared all values as they are when controll comes in while loop
				else {
					flag=true;
					rev=0;
					j=0;
					i++;
					
					//if i greater or equal to length of array then stop the loop
					if(i<arr.length) {
						temp=arr[i];
					}
				}				
			}
		}
		//now diplaying count and devide it by 2
		//it iterate that reverse no also and we get count increse so
		//eq.[43,34] it has to be result as 1 but we are getting 2
		//thats why...
		System.out.println(count/2);
	}
}
