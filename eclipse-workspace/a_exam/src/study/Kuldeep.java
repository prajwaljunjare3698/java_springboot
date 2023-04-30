package study;

	//que- print the no from 1 to 10 without using for loop

public class Kuldeep {

//	main method recursion(can call main method inside main)
	public class MyClass {
    		static int a = 1;
    		public static void main(String args[]) {
        		if(a<=10){
            		System.out.println(a++);
            		main(null);
        		}
	    }
	}
}
//op = 10