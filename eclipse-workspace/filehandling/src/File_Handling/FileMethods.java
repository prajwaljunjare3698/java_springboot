package File_Handling;

import java.io.File;

public class FileMethods {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\kisho\\eclipse-workspace\\J2EE\\src\\main\\java\\File_Handling/demo3.txt");
		if(f.exists()) {
			System.out.println("already present");
		}
		else {
			try {
				f.createNewFile();
				System.out.println("created");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		} 
		if(f.canRead()) {
			System.out.println("readable");
		}
		if(f.canExecute()) {
			System.out.println("executable");
		}
		if(f.canWrite()) {
			System.out.println("writable");
		}
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		f.delete();
		System.out.println("file deleted");
	}
}
