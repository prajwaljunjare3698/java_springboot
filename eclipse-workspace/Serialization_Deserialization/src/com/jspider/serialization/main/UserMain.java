package com.jspider.serialization.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspider.serializationClass.User;

public class UserMain {
	public static void main(String[] args) throws Exception {
		User user = new User(101,"abc","abc@123");
		    
		FileOutputStream fout = new FileOutputStream("C:\\Users\\kisho\\eclipse-workspace\\Serialization_Deserialization\\demo.txt");
		ObjectOutputStream objectStream = new ObjectOutputStream(fout);
		objectStream.writeObject(user);
		objectStream.flush();
		objectStream.close();
		System.out.println("data send successfully...");
		 
		FileInputStream finput = new FileInputStream("C:\\Users\\kisho\\eclipse-workspace\\Serialization_Deserialization\\demo.txt");
		ObjectInputStream objectIn = new ObjectInputStream(finput);
		User readObject = (User)objectIn.readObject();
		System.out.println(readObject);
		System.out.println("data read successfully...");
		
		objectIn.close();
	}
}
  