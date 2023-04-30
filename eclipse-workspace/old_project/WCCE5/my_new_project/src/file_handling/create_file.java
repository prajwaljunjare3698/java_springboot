package file_handling;

import java.io.File;
import java.io.IOException;

public class create_file {
	public static void main(String[] args) {
		File f = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling//first.txt");
		try {
			f.createNewFile();
			}
		catch (IOException e) 
		{
			System.out.println("invalid");
			e.printStackTrace();
		}
	}
}
