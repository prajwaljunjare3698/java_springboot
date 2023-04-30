package file_handling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class read_write2 {
	public static void main(String[] args) {
		File f = new File("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\write1.txt");
		try {
			FileReader fr = new FileReader(f);
			
			//FileWriter fw = new FileWriter(f);
			
//			int i;
//			int count=0;
//			while((i=fr.read())!=-1) {
//				if((char)i!='d')
//					System.out.print((char)i);
//				if((char)i==' ') {	//count spaces in the file
//					count++;
//				}
//			}
//			System.out.println(count);
//			System.out.println(f.length());
//			fr.close();
			
			int count=0;
			Scanner sc = new Scanner(fr);
			while(sc.hasNextLine()) {
				if(sc.next() != null) {//count words in file
					count++;
				}
//				if(sc.next()=="af") {
//					sc.remove();
//				}
			}
			System.out.println(count);
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
}
