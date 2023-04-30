package function;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
	String name;
	double marks;
//	String grade;
	
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}	
}
public class Marks {
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student("durga",78));
		st.add(new Student("sravy",48));
		st.add(new Student("kajal",28));
		st.add(new Student("katrina",64));
		
		Function<Student,String> f = s->{
			return null;
//			int mark =s.marks;
//			String grade="";
//			if(marks)
		};
		
		for(Student a:st) {
			
		}
	}
}
