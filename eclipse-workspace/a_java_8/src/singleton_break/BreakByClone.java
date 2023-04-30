package singleton_break;
class Singleton implements Cloneable{
	static Singleton obj = new Singleton();
	Singleton(){}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
//	protected Object clone() throws CloneNotSupportedException {
//		throw new CloneNotSupportedException();
//	}
	public static Singleton getInstance() {
		return obj;
	}
}
public class BreakByClone {
	static final int a=4;
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton i1 = Singleton.getInstance();
		Singleton i2 = Singleton.getInstance();
		Object i3 = i2.clone();
		
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode()); 
		System.out.println(i3.hashCode());
	}
}
