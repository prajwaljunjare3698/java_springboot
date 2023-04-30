package singleton_break;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SingletonB{
	static SingletonB obj = null;
	private SingletonB() {}
	public static SingletonB getInstace() {
		if(obj==null) {
			return new SingletonB();
		}
		return obj;		
	}
}
public class SingletonBreakReflection {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		SingletonB obj1 = SingletonB.getInstace();
		System.out.println(obj1.hashCode());		
			Constructor<SingletonB> constructor = SingletonB.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			SingletonB obj2 = constructor.newInstance();
			System.out.println(obj2.hashCode());
	}
}
