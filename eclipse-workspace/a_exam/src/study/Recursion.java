package study;

public class Recursion {
	static int sum = 0;
	static int i=0;
	public static void main(String[] args) {
		int a = 1;
		
		//show(a);
		add(1,2,3,4);
	}

	public static void show(int a) {
		if(a<=10) {
			System.out.println(a);
			temp(a);
		}
		System.out.println(a);
	}

	public static void temp(int a) {
		if(a<=10) {
			System.out.println(a++);
			temp(a);
		}
		//System.out.println("temp");
	}
	public static void add(int...arr){		
		if(i<arr.length) {
			sum = sum+arr[i];
			i=i+1;
			add(arr);
		}
		else {
			System.out.println(sum);
		}
	}

}
