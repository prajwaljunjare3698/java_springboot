package shubham.ProgrammingW++m2.src.collection;

public class Car implements Comparable<Car>{
	int cost;
	Car(int cost)
	{
		this.cost=cost;
	}
	@Override
	public String toString()
	{
		return "cost :"+cost;
	}
//	@Override
//	public int compareTo(Car c )
//	{
//		return c.cost-this.cost;
//		
//	}

	@Override
	public int compareTo(Car c )
    {
		return this.cost-c.cost;
	}
	
	

}
