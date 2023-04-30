package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_write1 {
	public static void main(String[] args) {
		
//			try {
//				FileWriter f = new FileWriter("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\write1.txt");
//				f.write("this is the written in file in the program");
//				System.out.println("data added successfully");
//				f.close();
//			}
//			catch(Exception e) {
//				System.out.println("invalid");
//			}
			
			try {
				File rd = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\write1.txt");
				try {
					Scanner sc = new Scanner(rd);
					while(sc.hasNextLine()) {
						System.out.print(sc.next()+" ");
					}
					sc.close();
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
			catch(Exception e) {
				System.out.println("not found");
			}
	}
}
