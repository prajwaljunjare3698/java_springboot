package file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class output_in_file {
	public static void main(String[] args) {
	    int i;
	    List<String> ls = new ArrayList<String>();
	    for (i = 1; i <= 10; i++) {
	        String str = null;
	        str = +i + ":-  HOW TO WRITE A CONSOLE OUTPUT IN A TEXT FILE";
	        ls.add(str);
	    }
	    String listString = "";
	    for (String s : ls) {
	        listString += s + "\n";
	    }
	    FileWriter writer = null;
	    try {
	        writer = new FileWriter("C:\\Programming\\WCCE5\\my_new_project\\src\\file_handling\\final.txt");
	        writer.write(listString);
	        writer.close();
	       System.out.println("output added in file");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	}
}