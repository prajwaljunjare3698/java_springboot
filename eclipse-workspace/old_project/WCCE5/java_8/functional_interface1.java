package java_8;

@FunctionalInterface
public interface functional_interface1 extends functional_interface {
	public static void store() {
		System.out.println("add");
	}
}
//
//if i add abstract method in functianl_interface1 then it is extends functional_interface
//and it contains 1 abstract method  but now fun2 will have 2 abstract method 
//so we have to remove @fun annotation because it will work as simple interface