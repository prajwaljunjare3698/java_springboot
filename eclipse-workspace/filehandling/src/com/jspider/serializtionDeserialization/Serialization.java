package com.jspider.serializtionDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization{
	public static void main(String[] args) {
		User user = new User(1, "abc", "abc@1234");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\kisho\\eclipse-workspace\\filehandling\\src\\com\\jspider\\serializtionDeserialization\\test.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(user);
			System.out.println("object written...");
			objectOutputStream.flush();
			objectOutputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}