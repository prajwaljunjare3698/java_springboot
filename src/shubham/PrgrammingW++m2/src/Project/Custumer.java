package Project;

public class Custumer {
	public static void main(String[] args) {
		
	Hotel h = new Hotel();
	Food f1  = h.orderFood(3);
	if (f1 instanceof Dosa)
	{
		System.out.println("Order Dosa");
	}
	else if( f1 instanceof Noodles )
	{
		System.out.println("Order Noodles");
	}
	else if(f1 instanceof ButterChicken)
	{
		System.out.println("Order ButterChicken");
	}
	else
	{
		System.out.println("Invalid option");
	}

}
}