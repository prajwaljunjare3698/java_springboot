package Arrays_pro;

import java.util.Arrays;

public class occurance_of_element {
	public static void main(String[] args) {
		int arr[] = {11,1,1,1,1,1,1,1,1};
		int visit[] = new int[arr.length];
		int i=0;
		int j=0;
		int k=0;
		int ind=0;
		int count=1;
		int stop=0;
		boolean flag=true;
		int pre=0;
		while(i<arr.length) {
			if(flag) {
				if(k<visit.length) {
					if(arr[i]!=visit[k]) {
						k++;
					}
					else {
						pre++;
					}
				}
				else {
					if(pre==0) {
						visit[ind]=arr[i];
						ind++;
						flag=false;
						j=i+1;
					}
					else {
						i++;
						pre=0;
					}
				}				
			}
			if(!flag) {
				if(j<arr.length) {
					if(arr[i]==arr[j]) {
						count++;
					}
					j++;
				}
				else {
					System.out.println(arr[i]+" comes "+count);
					count=1;
					j=0;
					flag=true;
					i++;
					stop++;
				}
			}
		}
		System.out.println("last");
	}
}
