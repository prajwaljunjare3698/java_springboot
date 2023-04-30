package java_8;

import java.util.function.Function;

public class lambda_exp {
	public void simple() {
		System.out.println("simple");
	}
	public static void main(String[] args) {
	
		Function<Integer,String> function=(t)->"output :"+t;
			//System.out.println("lambda expression"+t);
			System.out.println();
		function.apply(3);
	}
	
}
