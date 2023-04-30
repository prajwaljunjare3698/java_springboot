package functional_interface;
class Check extends Exception{
	Check(String s){
		super(s);
	}
}
public class custom_exception {
	public static void main(String[] args) throws Check {
		int age = 20;  
		if(age>30) {
			System.out.println("permitted");
		}
		else {
			throw new Check("not allowed");
		}
	}
}
