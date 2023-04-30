package Design_Patterns;
import java.util.Scanner;

interface PlanRate{
	public void rate();
}

class VI implements PlanRate{
	public void rate() {
		double rate = 1.2;
		System.out.println(rate);
	}
}
class Jio implements PlanRate{
	public void rate() {
		double rate = 3.5;
		System.out.println(rate);
	}
}
class RateFactory{
	public PlanRate getRate(String rateType) {
		if(rateType==null) {
			return null;
		}
		else if(rateType.equalsIgnoreCase("Vi")) {
			return new VI();
		}
		else if(rateType.equalsIgnoreCase("Jio ")) {
			return new Jio();
		}
		return null;
	}
}
public class FactoryDesign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter operator");
		String op = sc.next();
		
		RateFactory rf = new RateFactory();
		
		PlanRate pr = rf.getRate(op);
		pr.rate();
	}

}
