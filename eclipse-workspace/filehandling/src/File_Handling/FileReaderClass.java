package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\kisho\\eclipse-workspace\\J2EE\\src\\main\\java\\File_Handling\\first.txt");

		FileReader fr = new FileReader(f);
		System.out.println(fr.read()); 	//output in ascii of first char
	
		fr.close();
	}
	
}
