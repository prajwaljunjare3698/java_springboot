package functional_interface;
interface demo1{
	public abstract void add();
}

public class default_method implements demo1 {
	public void add() {
		System.out.println("implemented");
	}
	public static void main(String[] args) {
		default_method obj = new default_method();
		obj.add();
	}
}
