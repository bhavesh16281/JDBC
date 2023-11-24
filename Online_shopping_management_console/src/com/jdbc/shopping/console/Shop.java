package com.jdbc.shopping.console;
public class Shop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("CONNECTING TO DATABASE...");
		DatabaseConnection db = new DatabaseConnection();
//		System.out.println(db.dbConnection());
		db.dbConnection();
		System.out.println("\n---WELCOME TO ONLINE SHOPPING SYSTEM---");
		System.out.println("\n************************************************");
		
		SelectOptionToProceed sotp = new SelectOptionToProceed();
		sotp.options();

	}

}
