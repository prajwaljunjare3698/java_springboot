package CustomSorting;

public class Moive {
	String moivename;
	Double price;
	public Moive(String moivename, double price) {
		this.moivename = moivename;
		this.price = price;
	}
	@Override
	public String toString() {
		return  moivename +" "+ price;
	}
	
	

}
