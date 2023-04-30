package com.yogesh.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\workspace\\eclipse-workspace\\filehandling\\src\\com\\yogesh\\files\\yogesh.txt");
		
//		if(f.exists()) {
//			System.out.println("already is there");
//		}
//		else {
//			f.createNewFile();
//			System.out.println("file created...");
//		}
		
//		FileWriter fr = new FileWriter(f);
//		String s = "yogesh is goaeljdflkasjf;lod boy";
//		fr.write(s);
//		System.out.println("data written on file");
//		fr.close();
		
//		FileInputStream fis = new FileInputStream(f);
//		byte arr[] = fis.readAllBytes();
//		for(int i=0;i<arr.length;i++) {
//			System.out.print((char)arr[i]);
//		}	
		
		Scanner sc = new Scanner(f);
		while(sc.hasNext()) {
			String word = sc.next();
			System.out.print(word+"-"+word.length()+" ");
//			
//			System.out.println(word+" "+ word.length());
		}
	}
}
