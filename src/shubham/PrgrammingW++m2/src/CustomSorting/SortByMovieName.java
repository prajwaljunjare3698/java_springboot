package CustomSorting;

import java.util.Comparator;

public class SortByMovieName implements Comparator<Moive>{
	
	public int compare(Moive x , Moive y)
	{
		return x.moivename.compareTo(y.moivename);
	}

}
