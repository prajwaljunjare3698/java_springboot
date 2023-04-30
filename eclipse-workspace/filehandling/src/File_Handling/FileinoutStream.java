package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileinoutStream {
	public static void main(String[] args) {
		File f = new File("first.txt");
		if(f.exists()) {
			System.out.println("file is already there");
		}
		else {
			try {
				//f.createNewFile();
				f.setExecutable(true);
				f.setReadable(true);
				
				FileOutputStream outStream = new FileOutputStream(f);
				outStream.write(24);
				System.out.println("content written on file");
				outStream.close();
				
				FileInputStream inStream = new FileInputStream(f);
				System.out.println(inStream.read());
				inStream.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
