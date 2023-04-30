package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_write2 {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\first.txt");
			
			try {
				FileWriter fr = new FileWriter("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\first.txt");
				Scanner sc = new Scanner(f);
				while(sc.hasNext()) {
					if(sc.next().equals(" ")) {
						fr.write("Developer");
					}
				}
				System.out.println("info added");
				fr.close();				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
				
	}
}
