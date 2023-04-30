package com.jspider.jdbcMain;

public class CreateTable {	
	public static void main(String[] args) {
		createTable();
	}
	public static void createTable() {
		System.out.println("enter the table name\n");
		String tableName = DatabaseProperties.scanner.next();
		
		System.out.println("how many columns you want in table");
		int column = DatabaseProperties.scanner.nextInt();
		
		String query = "create table "+tableName+"(";
		
		for(int i=1;i<=column;i++) {
			
			System.out.println("1.enter column name\n2.column datatype\n3.constraint of column\n");
			String columnName = DatabaseProperties.scanner.next();
			String columnDatatype = DatabaseProperties.scanner.next();
			String columnConstraint = DatabaseProperties.scanner.next();
			
			String fields = columnName+" "+columnDatatype+" "+columnConstraint;
			query = query + fields;
		}	
		query = query + ")";
		System.out.println("table structure is ready,you can insert the records");	
	}
}
