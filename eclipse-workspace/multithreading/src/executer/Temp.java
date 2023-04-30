package executer;

public class Temp {
	int a = 10;
	public int m1() {
		return new Temp().a;
	}
	public static void main(String[] args) {
		int t = new Temp().m1();
		System.out.println(t);
		String string = "";
		StringBuffer f = new StringBuffer("");
	}
}
