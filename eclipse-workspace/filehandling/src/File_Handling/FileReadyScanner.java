package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileReadyScanner {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Users\\kisho\\eclipse-workspace\\J2EE\\src\\main\\java\\File_Handling\\first.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}		
		sc.close();
		
	try {
		f.createNewFile();
		f.canExecute();
		f.canRead();
		f.canWrite();	
		f.delete();
		f.exists();
		f.getAbsolutePath();
		f.length();
		f.setReadable(false);
		f.setWritable(false);
		f.getName();
		
		FileInputStream fis = new FileInputStream(f);
		fis.read();
		fis.read(null);
		fis.read(null, 0, 0);
		fis.close();
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(0);
		fos.write(null);;
		fos.close();
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
