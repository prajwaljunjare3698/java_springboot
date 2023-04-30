package file_handling;

import java.io.File;
import java.util.Scanner;

public class read_file {
	public static void main(String[] args) {
		File f = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\first.txt");

		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
			
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(f.length());
		
	}
}
