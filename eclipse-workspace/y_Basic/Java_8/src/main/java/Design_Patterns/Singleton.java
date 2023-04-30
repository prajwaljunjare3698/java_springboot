package Design_Patterns;
class Test1{
	static Test1 obj = new Test1();
	private Test1() {	
	}
	public static Test1 getObject() {
		return obj;
	}	
}
public class Singleton {
	public static void main(String[] args) {
		
		//not possible creating obj in regular way
		//Test1 t1 = new Test1();
		
		Test1 t1 = Test1.getObject();
		System.out.println(t1);
		
	}
}
