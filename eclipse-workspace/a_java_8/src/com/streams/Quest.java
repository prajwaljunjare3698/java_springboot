package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

class Empl
{
    int id;     
    String name;     
    int age;     
    String gender;     
    String department;     
    int yearOfJoining;     
    double salary;
     
    public Empl(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }}
public class Quest{
	public static void main(String[] args) {
		List<Empl> list = new ArrayList<Empl>();
        
		list.add(new Empl(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Empl(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		list.add(new Empl(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		list.add(new Empl(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		list.add(new Empl(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		list.add(new Empl(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		list.add(new Empl(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		list.add(new Empl(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		list.add(new Empl(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		list.add(new Empl(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		list.add(new Empl(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		list.add(new Empl(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		list.add(new Empl(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		list.add(new Empl(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		list.add(new Empl(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		list.add(new Empl(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		list.add(new Empl(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
//	greater sal >8000
//		list.stream().filter(e-> e.getSalary()>25000).map(e->e.getSalary()).forEach(System.out::println);
		
//	max sal
//		Emp max = a.stream().max(Comparator.comparing(Emp::getSal)).get();
//		System.out.println(max.getName());
	
//	top 3 sal
//		List<Emp> first = a.stream().sorted(Comparator.comparing(Emp::getSal).reversed()).limit(3).collect(Collectors.toList());
//		System.out.println(first);

//	3rd max sal
//		Empl empl = list.stream().sorted(Comparator.comparing(Empl::getSalary).reversed()).distinct().skip(2).findFirst().get();
//		System.out.println(empl.getSalary());
	
//	emps getting same sal(not done)
//		Predicate<Empl>c = (i1,i2)-> (i1==i2);
//		
//		List<Empl> collect = list.stream().sorted(c).collect(Collectors.toList());
//		System.out.println(collect);
		
		
//  lowest sal22
//		Emp min = a.stream().min(Comparator.comparingDouble(Emp::getSal)).get();
//		System.out.println(min.getName());
		
//	sort by name
//		a.stream().sorted(Comparator.comparing(Emp::getName)).collect(Collectors.toList()).forEach(System.out::println);
		
//	sort by name if names are same then by sal
//		a.stream().sorted(Comparator.comparing(Emp::getName).thenComparing(Emp::getSal)).collect(Collectors.toList()).forEach(System.out::println);
		
		
//	oldest age emp
//		Emp oldest = a.stream().sorted(Comparator.comparing(Emp::getAge).reversed()).limit(1).findFirst().get();
//		System.out.println(oldest);
		
//	name of male emp
//		a.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).collect(Collectors.toList()).forEach(System.out::println);
		
//	count male emp
//		long count = a.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).count();
//		System.out.println(count);
		
//	sal of male emp
//		a.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).collect(Collectors.toList()).forEach(System.out::println));
//		System.out.println(list);
		
//	total sal of male Emp
//		a.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).
				
//	no of emp in each dept
//		Map<String, Long> dept = a.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
//		System.out.println(dept);
		
//	avg sal
//		Double avg = a.stream().collect(Collectors.averagingDouble(Emp::getSal));
//		System.out.println(avg);
		
//	total sal
//		Double totalSal = a.stream().collect(Collectors.summingDouble(Emp::getSal));
//		System.out.println(totalSal);
		
		
//	all depts name
//		List<String> allDepts = list.stream().map(Empl::getDepartment).distinct().collect(Collectors.toList());
//		System.out.println(allDepts);
//		
//	avg age of male and female emp
//		Map<String,Double> collect = list.stream().collect(Collectors.groupingBy(Empl::getGender,Collectors.averagingInt(Empl::getAge)));
//		System.out.println(collect);
		
//	highest paid emp
//		Empl empl = list.stream().sorted(Comparator.comparing(Empl::getSalary).reversed()).findFirst().get();
//		System.out.println(empl);
//		
//  Get the names of all employees who have joined after 2015?
//		List<Empl> collect = list.stream().filter(e-> e.getYearOfJoining()>2015).collect(Collectors.toList());
		
//	Count the number of employees in each department?
//		Map<String, Long> count = list.stream().collect(Collectors.groupingBy(Empl::getDepartment,Collectors.counting()));
//		System.out.println(count);
//		
//	What is the average salary of each department?
//		Map<String,Double> collect = list.stream().collect(Collectors.groupingBy(Empl::getDepartment,Collectors.averagingDouble(Empl::getSalary)));
//		System.out.println(collect);
//		
//	youngest male in product dept
//		Empl empl = list.stream().filter(e-> e.getDepartment().equalsIgnoreCase("product development")).sorted(Comparator.comparing(Empl::getAge)).findFirst().get();
//		System.out.println(empl);
		
//	most working experience in the organization?
//		Empl empl = list.stream().sorted(Comparator.comparing(Empl::getYearOfJoining)).findFirst().get();
//		System.out.println(empl);
		
//	how many male and female in sales and marketing
//		Map<String,Long> collect = list.stream().filter(e-> e.getDepartment().equalsIgnoreCase("sales and marketing")).collect(Collectors.groupingBy(Empl::getGender,Collectors.counting()));
//		System.out.println(collect);
		
//	What is the average salary of male and female employees?
//		Map<String,Double> collect = list.stream().collect(Collectors.groupingBy(Empl::getGender,Collectors.averagingDouble(Empl::getSalary)));
//		System.out.println(collect);
		
//	List down the names of all employees in each department?
//		Map<String,List<Empl>> collect = list.stream().collect(Collectors.groupingBy(Empl::getDepartment));
//		Set<Entry<String,List<Empl>>> set = c.entrySet();
//		for(Entry<String, List<Empl>> a:set) {
//			System.out.println(a.getKey());
//			for(Empl e: a.getValue()) {
//				System.out.println(e.getName());
//			}
//			System.out.println();
//		}
		
//	What is the average salary and total salary of the whole organization? 
//		list.stream().collect(Collectors.averagingDouble(Empl::getSalary,Collectors.summarizingDouble(Empl::getSalary)));

//	Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
//		Map<Boolean,List<Empl>> collect = list.stream().collect(Collectors.partitioningBy(e-> e.getAge()>=25));
//		Set<Entry<Boolean,List<Empl>>> set = collect.entrySet();
//		for(Entry<Boolean,List<Empl>> e:set) {
//			if(e.getKey()) {
//				for(Empl emp: e.getValue()) {
//					System.out.println(emp.getName()+" "+emp.getAge());					
//				}
//			}
//			else {
//				for(Empl emp: e.getValue()) {
//					System.out.println(emp.getName()+" "+emp.getAge());					
//				}
//			}
//		}	
		
//	youngest emp in product dept
//		Empl first = list.stream().filter(e-> e.department.equalsIgnoreCase("product development")).sorted(Comparator.comparing(Empl::getAge)).findFirst().get();
//		System.out.println(first);
	
//	average sal of male and female
//		Map<String,Double> collect = list.stream().collect(Collectors.groupingBy(Empl::getGender,Collectors.averagingDouble(Empl::getSalary)));
//		System.out.println(collect);		
		
//	sort emps by sal
//		Comparator<Empl>c = (i1,i2)->{
//			double s1 = i1.getSalary();
//			double s2 = i2.getSalary();
//			if(s1>s2) return 1;
//			else if(s1<s2) return -1;
//			else return Double.compare(s1, s2);			
//		};
//		Comparator<Empl>c = (i1,i2)-> Double.compare(i1.getSalary(), i2.getSalary());
//		Collections.sort(list,c);
//		System.out.println(list);
		
		
//	    Map<String,Long> collect = list.stream().collect(Collectors.groupingBy(Empl::getGender,Collectors.counting()));
//	    System.out.println(collect);
		
		
//		Empl empl = list.stream().sorted(Comparator.comparingDouble(Empl::getSalary).reversed()).distinct().skip(2).findFirst().get();
//		System.out.println(empl.getSalary());
		
//		List<Empl> collect = list.stream().sorted(Comparator.comparingDouble(Empl::getSalary).reversed()).distinct().limit(2).collect(Collectors.toList());
//		System.out.println(collect);
		
		
		
		
		
		
//		Logical program
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	find duplicates from list
//		a.stream().filter(e-> Collections.frequency(a, e) > 1).collect(Collectors.toSet()).forEach(System.out::println);
		
//	find unique from list
//		a.stream().distinct().toList().forEach(System.out::println);
	
//	add add element in list
//		long sum = a.stream().collect(Collectors.summarizingLong(Integer::intValue)).getSum();

//	print 5 random no between 1-10;		
//		new Random().ints(1,10).limit(3).forEach(System.out::println);
		
//		convert string list to integer/long
//		List<String> l = new ArrayList<>(Arrays.asList("12","14","89","673","53"));
//		List<Integer> intValues = l.stream().map(e-> Integer.parseInt(e)).collect(Collectors.toList());
//		System.out.println(intValues       );
		
//		by method refference
//		List<Integer> intValues = l.stream().map(Integer::parseInt).collect(Collectors.toList());
//		System.out.println(intValues);
		
		
//		print the name start with a
//		List<String> list = new ArrayList<>(List.of("as","df","sdf","aesdf","a 	sa"));
//		List<String> startWithA = list.stream().filter(i-> i.startsWith("a")).collect(Collectors.toList());
//		System.out.println(startWithA);
		
//		inp={1,2,1,2,3,5,3,2}
//		op = {1=2, 2=3, 3=2, 5=1}
//		List<Integer> b = new ArrayList<>(List.of(1,2,1,2,3,5,3,2));
//		Map<Integer,Long> collect = b.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
	
//		List<String> b = new ArrayList<String>(List.of("a","aksdf","sd","ad","as","sd"));
//		b.stream().collect(Collectors.groupingBy(Function.identity()),Collectors.toList());
	
//		Streams- find First odd no greater than 7, multiply by 3 & return result
//		List<Integer> l=new ArrayList(List.of(3,1,5,4,3,2,7,9));
//		Integer first = l.stream().filter(i-> i%2==1 && i>7).findFirst().map(i-> i*3).get();
//		System.out.println(first);
		
		
//		calculate how many times character is coming in string
//		String s = "india is my coutry";
//		long count = s.chars().filter(i-> i=='i').count();
//		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
}