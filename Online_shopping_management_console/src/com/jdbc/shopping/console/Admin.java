package com.jdbc.shopping.console;

import java.sql.*;
import java.util.Scanner;

public class Admin extends Shop {
	private static Connection con;
	private static Statement stmt;
	Scanner sc = new Scanner(System.in);
	SelectOptionToProceed sotp = new SelectOptionToProceed();
	
	
	public void registerAsAdmin() throws SQLException {		
		int adminId = 0,homePage;
		String fName,lName,password,emailId,userName;
		Double mobileNo;
		
		System.out.print("Enter first name: ");
		fName = sc.next();
		fName = fName.toUpperCase();
		
		System.out.print("Enter last name: ");
		lName = sc.next();
		lName = lName.toUpperCase();
		
		System.out.print("Enter Email ID: ");
		emailId = sc.next();
		
		System.out.print("Enter Mobile Number : ");
		mobileNo = sc.nextDouble();
		
		userName = fName +"."+lName;
		userName = userName.toLowerCase();
		
		System.out.print("Create a password: ");
		password = sc.next();
		
		String userCheck = "select * from admin where binary userName = '"+userName+"'";
		con = DatabaseConnection.dbConnection();
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(userCheck);
		int count = 0;
		while(rs.next()) {
			count +=1;
		}
		
		try {
			if(count>0) {
				System.out.println("Username already exists, please register with a different username.");
			}
			else {
				String query = "insert into admin values ('"+adminId+"','"+fName+"','"
						+lName+"','"+emailId+"','"+mobileNo+"','"+userName+"','"+password+"')";
				int rs1 = stmt.executeUpdate(query);
				if(rs1>0) {
					System.out.println("Admin succesfully created...");
					System.out.println("Your user name is: "+ userName);			}
				else {
					System.out.println("Error creating admin...");
				}
				
			}
			
		}catch(SQLException e) {
			System.out.println("Please check your Database Connection...");
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
		System.out.print("Enter 0 to go to Homepage: ");
		homePage = sc.nextInt();
		if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else {
			System.out.println("Enter valid choice.");
		}
	}
	
	public void loginAsAdmin() {
		
		String userName,password;
		System.out.print("Enter User name: ");
		userName = sc.next();
		userName = userName.toLowerCase();
		System.out.print("Enter Password: ");
		password = sc.next();
		
		String query = "SELECT * FROM admin WHERE binary userName = '" + userName + "' and binary password = '"+ password +"'";
		try {
			con = DatabaseConnection.dbConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			int count = 0;
			while(rs.next()) {
				count +=1;
			}
		
			if(count == 0) {
				System.out.println("Username does not exist, please register as admin...");
			}
			else {
				System.out.println("\n************************************************");
				System.out.println("Succesfully logged in as admin.");
				sotp.adminMenuOptions();

			}
		}
		catch(Exception e){
			System.out.println("Please check your Database Connection...");
			e.printStackTrace();
		}
	}
	
	public void addProduct() {
		System.out.println("In the method add products..");
		
		System.out.print("Enter 0 to go to previous menu or 1 for Main menu : ");
		int homePage = sc.nextInt();
		if(homePage == 1) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.adminMenuOptions();
		}
		else {
			System.out.println("Enter either 0 or 1 ");
		}
		
	}
	
	public void deleteProduct() {
		System.out.println("In the method delete products..");
		
		System.out.print("Enter 0 to go to previous menu or 1 for Main menu : ");
		int homePage = sc.nextInt();
		if(homePage == 1) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.adminMenuOptions();
		}
		else {
			System.out.println("Enter either 0 or 1 ");
		}
	}
	
	public void viewProducts() {
		System.out.println("In the method view products..");
		
		System.out.print("Enter 0 to go to previous menu or 1 for Main menu : ");
		int homePage = sc.nextInt();
		if(homePage == 1) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.adminMenuOptions();
		}
		else {
			System.out.println("Enter either 0 or 1 ");
		}
	}
	
	public void searchProducts() {
		System.out.println("In the method search products..");
		
		System.out.print("Enter 0 to go to previous menu or 1 for Main menu : ");
		int homePage = sc.nextInt();
		if(homePage == 1) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.adminMenuOptions();
		}
		else {
			System.out.println("Enter either 0 or 1 ");
		}
	}
	
	public void removingCustomers() {
		System.out.println("In the method removing customers..");
		
		System.out.print("Enter 0 to go to previous menu or 1 for Main menu : ");
		int homePage = sc.nextInt();
		if(homePage == 1) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.adminMenuOptions();
		}
		else {
			System.out.println("Enter either 0 or 1 ");
		}
	}
	
	public void editingCustomers() {
		System.out.println("In the method edit customers..");
		
		System.out.print("Enter 0 to go to previous menu or 1 for Main menu : ");
		int homePage = sc.nextInt();
		if(homePage == 1) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.adminMenuOptions();
		}
		else {
			System.out.println("Enter either 0 or 1 ");
		}
	}
	
	public void viewCustomers() {
		System.out.println("In the method view customers..");
		
		System.out.print("Enter 0 to go to previous menu or 1 for Main menu : ");
		int homePage = sc.nextInt();
		if(homePage == 1) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.adminMenuOptions();
		}
		else {
			System.out.println("Enter either 0 or 1 ");
		}
	}
	
	public void editAdminProfile() {
		System.out.println("In the method edit admin profile..");
		
		System.out.print("Enter 0 to go to previous menu or 1 for Main menu : ");
		int homePage = sc.nextInt();
		if(homePage == 1) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.mainMenuOptions();
		}
		else if(homePage == 0) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.adminMenuOptions();
		}
		else {
			System.out.println("Enter either 0 or 1 ");
		}
	}

}
