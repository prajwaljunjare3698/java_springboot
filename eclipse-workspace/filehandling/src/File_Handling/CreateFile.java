package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\kisho\\eclipse-workspace\\J2EE\\src\\main\\java\\File_Handling\\temp.txt");
		
		try {
			f.createNewFile();
			System.out.println("created");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
