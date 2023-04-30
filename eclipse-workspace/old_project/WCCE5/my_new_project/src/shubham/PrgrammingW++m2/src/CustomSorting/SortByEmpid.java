package CustomSorting;

import java.util.Comparator;

public class SortByEmpid implements Comparator<Employee>{
	
	//Sorting in descending
	@Override
	public int compare(Employee e1,Employee e2)
	{
		return  e2.id-e1.id;
	}

//	@Override //sorting in ascending 
//	public int compare(Employee e1,Employee e2)
//	{
//		return e1.id - e2.id;
//	}

}
