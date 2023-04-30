package file_handling;

import java.io.FileReader;

public class read_file2 {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\first.txt");			
			try {
				int i;
				while((i=f.read())!=-1) {
					System.out.print((char)i);
				}
				f.close();
			}
			finally {
				System.out.println("read success");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
