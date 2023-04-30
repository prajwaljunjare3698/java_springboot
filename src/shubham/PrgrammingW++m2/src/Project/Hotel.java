package Project;

public class Hotel {
	Food orderFood(int choice)
	{
		if(choice ==1)
		{
			Dosa d = new Dosa();
			return d;
		}
		else if(choice ==2)
		{
			Noodles n = new Noodles();
			return n;
	     }
		else if(choice ==3)
		{
			ButterChicken b = new ButterChicken();
		return b;
		}
		else
		{
			return null;
		}
		
	}

}
