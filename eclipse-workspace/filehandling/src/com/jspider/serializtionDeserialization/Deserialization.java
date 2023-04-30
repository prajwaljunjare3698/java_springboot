package com.jspider.serializtionDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\kisho\\eclipse-workspace\\filehandling\\src\\com\\jspider\\serializtionDeserialization\\test.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			User readObject = (User) objectInputStream.readObject();
			System.out.println(readObject);
			objectInputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
