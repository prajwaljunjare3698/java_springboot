package File_Handling;

import java.io.File;

public class CreatFile {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\kisho\\eclipse-workspace\\J2EE\\src\\main\\java\\File_Handling/demo.txt");
		try {
			f.createNewFile();
			System.out.println("file created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
