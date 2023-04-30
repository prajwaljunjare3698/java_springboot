package Collection.programs_by_collction;

import java.util.ArrayList;
import java.util.List;

public class frist {
	public static void main(String[] args) {
		List<Integer> a= new ArrayList<Integer>(3);
		a.add(3);
		a.add(2);
		a.add(9);
		a.add(null);
		a.add(8);
		System.out.println(a);
		
		//System.out.println(get());
		get();
	}
	public static void get(){
		ArrayList a=new ArrayList();
		a.add(3);
		a.add(2);
		a.add(9);
		a.add(null);
		a.add(8);
		System.out.println(a);
		return;
	}
}
