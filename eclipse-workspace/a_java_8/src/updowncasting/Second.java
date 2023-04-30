package updowncasting;

class First {
	 int a = 10;
	 public void add() {
		 System.out.println("from First");
	 }
}
public class Second extends First{
	int a = 20;
	public static void main(String[] args) {
		Second s = new Second();
		s.add();
		System.out.println(s.a);
		
		First f = new First();
		f.add();
		System.out.println(f.a);
		
//		Second obj = (Second) new First();	
//		System.out.println(obj.a);  //ClassCastException  
		
		First obj = new Second();
		obj.add();
		
		
	}
}
