package com.jdbc.shopping.console;
public class Shop {

	public static void main(String[] args) throws Exception {
		
		System.out.println("CONNECTING TO DATABASE...");
		DatabaseConnection.dbConnection();
		
		System.out.println("\n---WELCOME TO ONLINE SHOPPING SYSTEM---");
		System.out.println("\n************************************************");
		
		SelectOptionToProceed sotp = new SelectOptionToProceed();
		sotp.mainMenuOptions();
		
		

	}

}
