package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\kisho\\eclipse-workspace\\J2EE\\src\\main\\java\\File_Handling\\temp.txt");
		
		if(!f.exists()) {
			System.out.println("file is not there");
		}
		else {
			try {
				FileInputStream fis = new FileInputStream(f);
				byte arr[] = fis.readAllBytes();
				for(int i=0;i<arr.length;i++) {
					System.out.print((char)arr[i]);
				}				
				fis.close();
			} catch (FileNotFoundException  e) {
				e.printStackTrace();			
			}			
			catch(IOException i) {
				i.printStackTrace();
			}
		}
	}
}
