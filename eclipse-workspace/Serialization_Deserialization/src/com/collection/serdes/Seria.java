package com.collection.serdes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String city;
	
	public Student(int id,String name,String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}

public class Seria {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("student.txt");
		
		FileOutputStream fileOutputStream = new FileOutputStream(f);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(new Student(22, "rushya", "dhule"));
		System.out.println("object written succesffyllyy...");
		objectOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(f);
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		Object readObject = inputStream.readObject();
		System.out.println(readObject);
		inputStream.close();
		
	}
}
