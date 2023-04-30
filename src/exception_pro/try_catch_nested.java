package exception_pro;

public class try_catch_nested {
	public static void main(String[] args) {
		try {
			System.out.println(1/1);
			try {
				System.out.println(2/0);
			}
			catch(Exception e) {
				e.printStackTrace();
				try {
					String c = null;
					System.out.println(c.charAt(3));
				}
				catch(Exception k) {
					System.out.println(k);
				}
				try {
					System.out.println(2/0);
				}
				catch(Exception d) {
					System.out.println(d);
				}
			}
		}
		finally {
			System.out.println("finally");
		}
	}
}
