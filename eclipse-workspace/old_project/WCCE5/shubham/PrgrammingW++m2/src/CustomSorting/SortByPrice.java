package CustomSorting;

import java.util.Comparator;

public class SortByPrice implements Comparator<Moive>{
	
	@Override
	public int compare(Moive a , Moive b)
	{
		return a.price.compareTo(b.price);
	}

}
