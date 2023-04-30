package Interview_pro;

//assignment-3)
// answer->

public class Mind_nerve_pro {
	public static void main(String[] args) {
		int arr[] = {21,43,54,23,67,90,84,34,45,55,76,26,48};
		
		boolean flag=true;
		int i=0;
		int j=0;
		int rev=0;
		int first=0;
		int count=0;
		boolean check=false;
		//int j=i+1;
		while(i<arr.length) {
			if(flag) {
				first = arr[i];
				j = i+1;
				flag=false;
			}
			if(!flag) {
				if(first>0) {
					int temp = first%10;
					rev=rev*10+temp;
					first=first/10;
				}
				else {
					if(j<arr.length) {
						if(rev==arr[j]) {
							count++;
						}
						j++;
					}
					else {
						flag=true;
						rev=0;
						i++;
					}
				}
			}			
		}
		System.out.println(count);
	}
}
