package com.singleton;

public class DatabaseConnection {
	
	private static DatabaseConnection databaseObject;
	
	private DatabaseConnection() {
		
	}
	
	public static DatabaseConnection getInstance() {
		
		if(databaseObject == null)
			databaseObject = new DatabaseConnection();
		return databaseObject;
		
	}
	
	public void getDatabaseConnection() {
		
		System.out.println("Connected");
		
	}

}
