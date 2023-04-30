package exception_pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws_ex  {
	public static void main(String[] args) throws FileNotFoundException {
		throws_ex ex = new throws_ex();
		try {
			ex.readFile();
		}
		catch(Exception e) {
			System.out.println("file not found");
		}		
		System.out.println("last staemnt");
	}
	void readFile() throws FileNotFoundException{
		FileInputStream f = new FileInputStream("c:xyz.txt");
		
	}
}
