package CustomSorting;

import java.util.TreeSet;

public class EDriver {
	public static void main(String[] args) {
		Employee e1=new Employee(22, "Teddy");
		Employee e2=new Employee(23, "Dinga");
		Employee e3=new Employee(21, "Smith");
		
		
		SortByEmpid id = new SortByEmpid();
		SortbyEmpName name = new SortbyEmpName();
		
		
		TreeSet<Employee> t =new TreeSet(name);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		for(Employee e :t)
		{
			System.out.println(e);
		}
		
	}

}
