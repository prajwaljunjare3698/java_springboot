package com.jspider.fileprograms;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\workspace\\eclipse-workspace\\filehandling\\src\\readfile.txt");
		
		Scanner sc = new Scanner(fr);
		
		while(sc.hasNext()) {
			System.out.print(sc.nextLine());
		}
	}
}
