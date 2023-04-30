package file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class append_data {
	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\write1.txt",true);
		
		String s = "TATAzzzzzzzzzzzzzzzzzz";
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			fo.write(ch[i]);
		}
		
		fo.close();
		System.out.println("data added");
		//System.out.println(fo.exists());
	}
}
