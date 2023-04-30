package a_insurance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
class Customer{
	int id;
	String name;
	int age;
	InsuranceServices services;
	public Customer(int id, String name, int age, InsuranceServices services) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.services = services;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public InsuranceServices getServices() {
		return services;
	}
	public void setServices(InsuranceServices services) {
		this.services = services;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", services=" + services + "]";
	}
	
}
class InsuranceServices{
	int id;
	String name;
	double duration;
	double premium;
	public InsuranceServices(int id, String name, double duration, double premium) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.premium = premium;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "InsuranceServices [id=" + id + ", name=" + name + ", duration=" + duration + ", premium=" + premium
				+ "]";
	}
	
}
public class InsuranceTransaction {
	public static void main(String[] args) {
		Map<Integer, Map<Customer, InsuranceServices> > m = new LinkedHashMap<>();		
		
		List<InsuranceServices>insuranceServices = new ArrayList<>();
		insuranceServices.add(new InsuranceServices(2,"lic",20,1400));
		insuranceServices.add(new InsuranceServices(4,"hdfc",40,6000));
		insuranceServices.add(new InsuranceServices(7,"sbi",33,220));
		insuranceServices.add(new InsuranceServices(8,"maha",42,00));
		
		Map<Customer, InsuranceServices> ci = new HashMap<>();
		ci.put(new Customer(1, "ashish", 20, new InsuranceServices(2, "lic", 20, 1200)),new InsuranceServices(11, "lic", 30, 3000));
		
		
		m.put(1, ci);
		System.out.println(m);
		
		
		
		
		
		
		
		
	}	
}
