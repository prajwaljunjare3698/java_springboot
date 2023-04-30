package Practice;

public class encapsulation {
	private int var = 10;
	public void setvalue(int a) {
		var = a;
	}
	public int getvalue() {
		return var;
	}
}
class derive{
	public static void main(String[] args) {
		encapsulation e = new encapsulation();
		e.getvalue();
	}
}