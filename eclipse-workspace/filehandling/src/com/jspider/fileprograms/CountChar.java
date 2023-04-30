package com.jspider.fileprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

import File_Handling.FileinoutStream;

public class CountChar {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\kisho\\eclipse-workspace\\filehandling\\src\\com\\jspider\\fileprograms\\simple");
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			byte b[] = {2,3,4,5,11,2,3,4,5,6,9};
			
			fileOutputStream.write(b);;
			System.out.println("content written on file");
			fileOutputStream.close();
			
			FileInputStream fileInputStream = new FileInputStream(file);
			System.out.println(fileInputStream.readNBytes(0));;//[B@5a07e868
			System.out.println(fileInputStream.readAllBytes());;//[B@76ed5528
			
			fileInputStream.close();
			
			FileReader fileReader = new FileReader(file);
			System.out.println(fileReader.read());
			int i;
            while ((i = fileReader.read()) != -1)
                System.out.print(i);
            fileReader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
