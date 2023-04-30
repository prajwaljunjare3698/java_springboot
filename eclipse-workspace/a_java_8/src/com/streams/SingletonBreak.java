package com.streams;
class Myclone implements Cloneable{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
}
class Singleton extends Myclone{
	static Singleton obj = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstace() {
		return obj;
	}
}
public class SingletonBreak {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Singleton i1 = Singleton.getInstace();
		System.out.println(i1.hashCode());
		
		Singleton i2 = Singleton.getInstace();
		System.out.println(i2.hashCode());
		
		Singleton i3 = (Singleton) i2.clone();
		System.out.println(i3.hashCode());
		
		Class c = Class.forName("com.example.pattern.SingletonPattern");
		System.out.println((Singleton) c.newInstance());
	}
}
