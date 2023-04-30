package no_conversion;

public class Dec_to_bin {
	public static void main(String[] args) {
		int dec = 12;
		String bin = "";
		
		while(dec>0) {
			int temp = dec%2;
			bin = temp + bin;
			dec=dec/2;
		}
		int no = Integer.parseInt(bin);
		System.out.println(bin);
	}
}
