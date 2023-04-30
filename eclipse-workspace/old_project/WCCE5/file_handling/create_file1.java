package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class create_file1 {
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\abc.txt");
		File w = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\abc.txt");
		FileWriter fr = new FileWriter("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\abc.txt");
		
//		try {
//			f.createNewFile();
//			System.out.println("file created");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		try {
			fr.write("first line is added");
			System.out.println("added");
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		f.delete();
//		System.out.println("file deleted");
	}
}
