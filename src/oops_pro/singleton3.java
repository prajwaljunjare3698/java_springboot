package oops_pro;

public class singleton3 {
	static singleton3 obj;
	
	private singleton3(){}
	
	public static singleton3 getInstance() {
		if(obj==null) {
			return obj=new singleton3();
		}
		return obj=new singleton3();
	}
	
	public static void main(String[] args) {
		singleton3 a1 = singleton3.getInstance();
		singleton3 a2 = singleton3.getInstance();
		
		System.out.println(a1);
		System.out.println(a2);
	}
}
