package file_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class read_write1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\write1.txt");
		FileWriter fw = new FileWriter("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\write1.txt");
		
		Scanner sc = new Scanner(fr);
		while(sc.hasNextLine()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
}
