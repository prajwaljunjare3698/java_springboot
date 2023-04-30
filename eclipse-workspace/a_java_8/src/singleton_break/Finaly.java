package singleton_break;

public class Finaly {
	public static void main(String[] args) {
		int check = check();
		System.out.println(check);
	}

	private static int check() {

		try {
			return 10;
		} catch (Exception e) {
		}
		finally {
			System.out.println("finally");
		}
		return 1;
	}
}
