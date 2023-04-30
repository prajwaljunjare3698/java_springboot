package com.collection.serdes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSer {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<User> a = new ArrayList<User>();
		a.add(new User(1, "akash"));
		a.add(new User(2, "vaibha"));
		a.add(new User(3, "abhi"));
		
		FileOutputStream fis = new FileOutputStream("user.text");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fis);
		objectOutputStream.writeObject(a);
		System.out.println("data written successfully...");
		objectOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream("user.text");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		ArrayList<User> data =(ArrayList<User>)inputStream.readObject();
		
		for(User u:data) {
			System.out.println(u.id+" "+u.name);
		}
		
		System.out.println("data read successfully...");
		
		inputStream.close();
	}
}
