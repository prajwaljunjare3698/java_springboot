package file_handling;

import java.io.File;

		//rename the file

public class file_rename {
public static void main(String[] args) {
	File f = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\java_que.txt");
	File n = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\java_interview.txt");
	
	if(f.exists()) {
		System.out.println(f.renameTo(n));
	}
	else {
		System.out.println("file not exists");
	}
}
}
