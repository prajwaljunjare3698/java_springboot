package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
	
	//copy data from one file to another

public class copy_one_to_another {
public static void main(String[] args)throws IOException {
	FileInputStream r = new FileInputStream("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\write1.txt");
	FileOutputStream w = new FileOutputStream("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\first.txt");
	
	int i;
	while((i=r.read())!=-1) {
		if((char)i=='a') {
			w.write((char)i);
		}
		//w.write((char)i);
	}
	System.out.println("data added in first from write file");
}
}
