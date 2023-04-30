package oops_pro;

public class this_keyword1 {
	int a = 10;
	this_keyword1()
	{
		this.a = 20;
	}
	public void show() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		this_keyword1 obj = new this_keyword1();
		obj.show();
		obj.a=40;
	}
}
