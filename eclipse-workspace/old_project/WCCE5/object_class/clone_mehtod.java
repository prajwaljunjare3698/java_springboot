package object_class;

import java.util.Arrays;

public class clone_mehtod {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]=a.clone();
		System.out.println(Arrays.toString(b));
	}
}
