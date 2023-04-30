package com.jspider.serialization.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspider.serializationClass.Emp;

public class EmpMain {
	public static void main(String[] args) throws Exception{
//		serialization();
		deserialization();
	}
	private static void serialization() throws Exception {
		FileOutputStream fileOutputStream = new FileOutputStream("emp.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		Emp e1 = new Emp(1,"aksh","pune");
		objectOutputStream.writeObject(e1);
		System.out.println("object written...");
		objectOutputStream.close();
	}
	
	private static void deserialization() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("emp.txt");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Object readObject = inputStream.readObject();
		System.out.println(readObject);
		inputStream.close();
	}
	
}
