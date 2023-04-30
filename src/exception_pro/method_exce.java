package my_new_project.exception_pro;

public class method_exce {
	public static void main(String[] args) {
		method_exce m = new method_exce();		
		try {
			int a=m.call();
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("exception occrue in method");
		}		
	}
	public int call() {
		int c;
		return c=1/0;
	}
}
