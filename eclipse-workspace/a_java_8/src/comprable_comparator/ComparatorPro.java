package comprable_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Emp{
	int id;
	String name;
	double sal;
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
public class ComparatorPro {
	public static void main(String[] args) {
		ArrayList<Emp> a = new ArrayList<>();
		a.add(new Emp(1, "akshay",28300));
		a.add(new Emp(2, "rushi",4600));
		a.add(new Emp(3, "kuldee",7300));
		a.add(new Emp(4, "uday",2300));
		a.add(new Emp(5, "kuldee",300));
		
//		by using collection.sort
//		Collections.sort(a,Comparator.comparing(Emp::getName).thenComparing(Emp::getSal));
//		Collections.sort(a,Comparator.comparing(Emp::getSal));
		
//		Collections.sort(a,Comparator.comparing(Emp::getName).thenComparing(Emp::getId));
		
		Comparator<Emp> byName = (x,y)-> x.name.compareTo(y.name);
		Comparator<Emp> bySal = (x,y) -> Double.compare(x.sal, y.sal);
		
//		List<Emp> collect = a.stream().sorted(c).collect(Collectors.toList());
		
		a.stream().sorted(byName.thenComparing(bySal)).forEach(System.out::println);
		
//		for(Emp e:collect) {
//			System.out.println(e.id+" "+e.name+" "+e.sal);
//		}
	}
}
