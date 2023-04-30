package file_handling;

import java.io.FileWriter;

public class file_write {
	public static void main(String[] args) {		
		try 
		{
			FileWriter f = new FileWriter("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling//first.txt");
			try {
				f.write("thi is josh java is object oriented programming");
				System.out.println("data added successully");
			}
			finally {
				f.close();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
