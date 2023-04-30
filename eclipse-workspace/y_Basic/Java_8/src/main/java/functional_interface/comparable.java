package functional_interface;
public class comparable implements Comparable<comparable>{  
	int rollno;  
	String name;  
	int age;  
	comparable(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	  
	public int compareTo(comparable st){  
		if(age==st.age)  
			return 0;  
		else if(age>st.age)  
			return 1;  
		else  
			return -1;  
	}  
}  
