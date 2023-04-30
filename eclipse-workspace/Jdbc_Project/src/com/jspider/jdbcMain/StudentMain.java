package com.jspider.jdbcMain;

public class StudentMain {
	private static boolean loop = true;
	public static void main(String[] args) throws Exception {
		System.err.println("wellcome to student management");
		System.out.println("plz select the select your choice\n");
		
		while(loop) {
			databaseOperation();
		}		
	}
	public static void databaseOperation() throws Exception {
		
		System.out.println("1.create table\n2.insert record\n3.update record \n4.delete record\n5.get record \n6.exit");
		int choice = DatabaseProperties.scanner.nextInt();
		
		if(choice>6 || choice<1) {
			System.err.println("enter proper choice");
		}
		else {
			switch (choice) {
				case 1:
					CreateTable.createTable();
					StudentMain.databaseOperation();
					break;
				case 2:
					InsertRecord.insertData();
					
				case 3:
					UpdateRecord.updateData();
	
				default:
					System.out.println("invalid input");
					break;
			}
		}
	}
}
