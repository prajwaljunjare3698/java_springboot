package Practice;

public class no_pattern6 {
	public static void main(String[] args) {
		String s = "Qspiders";
		String r = "";
		for(int i=s.length()-1; i>=0; i--) {
			r = s.substring(0, i+1);
			System.out.println(r);			
		}
		System.out.println(r);
	}
}
//qspiders
//qspider
//qspide
//qspid
//qspi
//qsp
//qs
//q