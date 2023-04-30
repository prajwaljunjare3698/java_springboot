package oops_pro;

public class emp_sal {
	double sal;
	double no_of_hr;
	
	public void getinfo(double sal,double no_of_hr) {
		this.sal = sal;
		this.no_of_hr = no_of_hr;
	}
	public void AddSal() {
		if(sal<5) {
			sal=sal+1;			
		}
	}
	public void AddWork() {
		if(no_of_hr > 6) {
			sal = sal+5;
		}
	}
	public double final_sal() {
		return sal;
	}
	public static void main(String[] args) {
		emp_sal obj = new emp_sal();
		obj.getinfo(6,5);
		obj.AddSal();
		obj.AddWork();
		System.out.println(obj.final_sal());
	}
}
