package File_Handling;
class demo{
	public static final void add() {
		System.out.println("satic final from demo");
	}
}
public class practice extends demo {
	public static void main(String[] args) {
		add();
		demo.add();
	}
	//cant use same static parent class method in child
//	public static final void add() {
//		System.out.println("satic final in practice");
//	}
}
