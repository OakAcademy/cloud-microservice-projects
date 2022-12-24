package com.singleton;

public class MainTest {

	public static void main(String[] args) {
		
		DatabaseConnection MySQL;
		
		MySQL = DatabaseConnection.getInstance();
		
		MySQL.getDatabaseConnection();

	}

}
