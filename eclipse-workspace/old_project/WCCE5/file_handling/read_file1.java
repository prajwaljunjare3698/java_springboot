package file_handling;

import java.io.FileReader;
import java.util.Scanner;

public class read_file1 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\java_que.txt");
			try {
				Scanner sc = new Scanner(fr);
				while(sc.hasNextLine()) {
					System.out.println(fr.read()+" ");
				}
				sc.close();
			}
			catch(Exception e) {
				System.out.println("not found");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
