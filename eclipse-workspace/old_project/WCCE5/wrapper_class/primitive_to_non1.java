package wrapper_class;

public class primitive_to_non1 {
	public static void main(String[] args) {
		int i = 120;
		Integer j = i;	//implicitly compiler adding valueOf() method
		System.out.println(j);
	}
}
