package collections;

public class Phone {
	String brand;
	double cost;
	public Phone(String brand, double cost) {
		
		this.brand = brand;
		this.cost = cost;
	}
	@Override
	public String toString()
	{
		return "Brand :"+brand+" Cost :"+cost;
	}
	
	

}
