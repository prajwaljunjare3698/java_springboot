package stream_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Emp{
	int id;
	String name;
	double sal;
	int age;
	public Emp(int id, String name, double sal,int age) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + "]";
	}
}
public class Practice {
	public static void main(String[] args) {
		List<Emp> a = new ArrayList<>();
		a.add(new Emp(3, "prajwal", 1200,26));
		a.add(new Emp(1, "abhi", 7000,23));
		a.add(new Emp(5, "kuldeep", 2200,31));
		a.add(new Emp(4, "sanket", 8100,28));
		a.add(new Emp(7, "sanket", 8100,25));
		
		//regular way
//		a.stream().sorted(Comparator.comparingDouble(Emp::getSal).reversed()).collect(Collectors.toList()).forEach(System.out::println);
//		a.stream().sorted(Comparator.comparing(Emp::getSal).thenComparing(Emp::getId)).collect(Collectors.toList()).forEach(System.out::println);
//		a.stream().filter(i-> i.getName().contains("a")).collect(Collectors.toList()).forEach(System.out::println);
//		a.stream().sorted(Comparator.comparing(Emp::getSal).thenComparing(Emp::getId).reversed()).limit(2).collect(Collectors.toList()).forEach(System.out::println);
//		a.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
//		Emp emp = a.stream().min(Comparator.comparing(Emp::getSal)).get();
//		System.out.println(emp);
//		Emp emp = a.stream().sorted(Comparator.comparing(Emp::getSal).thenComparing(Emp::getId).reversed()).skip(1).findFirst().get();
//		System.out.println(emp);
//		a.stream().filter(i-> i.getSal()>2000).collect(Collectors.toList()).forEach(System.out::println);;
//		a.stream().filter(i-> i.getSal()<2000).map(i-> i.getSal()+100).collect(Collectors.toList()).forEach(System.out::println);;
		
//		Comparator<Emp> c = (i1,i2)->{
//			int a1 = i1.getName().length();
//			int a2 = i2.getName().length();
//			if(a1>a2) return 1;
//			else if(a2>a1) return -1;
//			else return i1.getName().compareTo(i2.getName());
//		};
//		a.stream().sorted(c).collect(Collectors.toList()).forEach(System.out::println);;
//		Emp emp = a.stream().sorted(c).findFirst().get();
//		System.out.println(emp);
//		Emp emp = a.stream().sorted(c.reversed()).findFirst().get();
//		System.out.println(emp);
		
//		Emp emp = a.stream().sorted(Comparator.comparing(Emp::getAge).reversed()).findFirst().get();
//		System.out.println(emp);
//		Emp emp = a.stream().sorted(Comparator.comparing(Emp::getAge)).findFirst().get();
//		System.out.println(emp);
		
//		long longValue = a.stream().collect(Collectors.summingDouble(Emp::getSal)).longValue();
//		System.out.println(longValue);
	
//		List<Integer>l = new ArrayList<>(List.of(2,3,1,0,4,5,3));
//		Collections.reverse(l);
//		System.out.println(l);
		
//		LocalDate d = LocalDate.now();
//		LocalTime t = LocalTime.now();
//		System.out.println(d);
//		System.out.println(d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//		System.out.println(d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
//		System.out.println(t.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
//		System.out.println(t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
		
//		List<Integer> l = new ArrayList<>(List.of(1,2,1,2,3,2,1,2,3,4,5));
//		Map<Integer, Integer> m = new HashMap<>();
//		for(Integer i:l) {
//			if(m.containsKey(i)) {
//				int count = m.get(i);
//				m.put(i, ++count);
//			}
//			else {
//				m.put(i, 1);
//			}
//		}
//		System.out.println(m);
//		
//		Set<Integer> collect = l.stream().filter(e-> Collections.frequency(l, e)>1).collect(Collectors.toSet());
//		System.out.println(collect);
		
//		Map<Integer,Emp> collect = a.stream().collect(Collectors.toMap(Emp::getId,e->e));
//		System.out.println(collect);
//		Map<Integer,String> collect = a.stream().collect(Collectors.toMap(Emp::getId, e->e.getName()));
//		System.out.println(collect);
		
//		Random random = new Random();
//        random.ints().limit(5).forEach(System.out::println);
        
        List<Integer> l = new ArrayList<>(List.of(2,3,2,3,1,4,5,6,4,5,6,8));
//        Integer last = l.stream().sorted(Comparator.reverseOrder()).findFirst().get();
//        System.out.println(last);
//        Set<Integer> collect = l.stream().collect(Collectors.toSet());
//        System.out.println(collect);
		
//		Integer first = l.stream().min(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println(first);
//		Integer last = l.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println(last);
		
//        int arr[] = {1,2,3,4};
//        IntStream s = Arrays.stream(arr);
//        s.forEach(e-> System.out.println("numbers are "+e));
		
        Map<String, Integer> c = new ConcurrentHashMap<>();
        c.put("1", 2);
        c.put("2", 3);
        c.put("0", 1);
		System.out.println(c);
		
		HashMap<String, Integer> b = new HashMap<>(c);
		System.out.println(b);
		
	}
}
