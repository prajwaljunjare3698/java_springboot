package object_class;

public class equals_override {
	int a;
	String s;
	equals_override(int a,String s){
		this.a=a;
		this.s=s;
	}
	public static void main(String[] args) {
		equals_override e1 = new equals_override(20,"abc");
		equals_override e2 = new equals_override(20,"abc");
		
		System.out.println(e1.equals(e2));
	}
	public boolean equals(Object o) {
		equals_override e3 = (equals_override)o;
		if(this.a==e3.a && this.s==e3.s) {
			return true;
		}
		return false;
	}
	
}