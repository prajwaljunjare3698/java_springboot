package com.Exception;

class Test extends Exception{
	Test(String s){
		super(s);
	}
}
public class CustomEx {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println(1/0);
			if(4<=10) {
				throw new Test("not valid");
			}
			else {
				System.out.println("valid");
			}
			
		}finally {
			System.out.println("finally");
		}
		
		
	}
}
