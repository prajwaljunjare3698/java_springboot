package a_revise_pro;
public class add_complex_no {
	double real, imaginary;	
	add_complex_no(double r, double i) {
		this.real = r;
		this.imaginary = i;
	}
	
	public static void main(String args[]){
		add_complex_no cn1 = new add_complex_no(10.7, 22.5);
		add_complex_no cn2 = new add_complex_no(28.2, 68);
		
		add_complex_no addition = sum(cn1, cn2);
		System.out.printf("Sum= "+addition.real+ "+"+addition.imaginary+"i");
	}
	
	public static add_complex_no sum(add_complex_no cn1, add_complex_no cn2) {
		add_complex_no addition = new add_complex_no(0, 0);
		addition.real = cn1.real + cn2.real;
		addition.imaginary = cn1.imaginary + cn2.imaginary;
		
		return addition;
	}
}
