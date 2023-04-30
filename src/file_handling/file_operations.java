package file_handling;

import java.io.File;
import java.io.IOException;

public class file_operations {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling//first.txt");
		
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			//System.out.println(f.getPath());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.length());
			System.out.println(f.delete());
		}
		else {
			System.out.println("file not exist");
		}
	}
}
