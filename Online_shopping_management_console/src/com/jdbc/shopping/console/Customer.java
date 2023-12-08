package com.jdbc.shopping.console;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Customer extends Shop {
	private static Connection con;
	private static Statement stmt;
	Scanner sc = new Scanner(System.in);
	
	public void regesterAsCustomer() throws SQLException {
		int custId = 0,homePage;
		String custFName,custLName,custPassword,custEmailId,userName;
		Double mobileNo;
		
		System.out.print("Enter first name: ");
		custFName = sc.next();
		custFName = custFName.toUpperCase();
		
		System.out.print("Enter last name: ");
		custLName = sc.next();
		custLName = custLName.toUpperCase();
		
		System.out.print("Enter Email ID: ");
		custEmailId = sc.next();
		
		System.out.print("Enter Mobile Number : ");
		mobileNo = sc.nextDouble();
		
		userName = custFName +"."+custLName;
		userName = userName.toLowerCase();
		
		System.out.println("Create a password: ");
		custPassword = sc.next();
		
		String userCheck = "select * from customer where binary userName = '"+userName+"'";
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
				String query = "insert into customer values ('"+custId+"','"+custFName+"','"
						+custLName+"','"+custEmailId+"','"+mobileNo+"','"+userName+"','"+custPassword+"')";
				int rs1 = stmt.executeUpdate(query);
				if(rs1>0) {
					System.out.println("Customer succesfully created...");
					System.out.println("Your user name is: "+ userName);			}
				else {
					System.out.println("Error creating Customer...");
				}
				
			}
			
		}catch(SQLException e) {
			System.out.println("Please check your Database Connection...");
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
		System.out.print("Enter 6 to go to Homepage: ");
		homePage = sc.nextInt();
		if(homePage == 6) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.options();
		}
		else {
			System.out.println("Enter valid choice.");
		}
	}
	
	public void loginAsCustomer() {
		System.out.println("Method to login as Customer");
		
		String userName,password;
		System.out.println("Method to login as Customer");
		System.out.print("Enter User name: ");
		userName = sc.next();
		System.out.print("Enter Password: ");
		password = sc.next();
		
		String query = "SELECT * FROM customer WHERE binary userName = '" + userName + "' and binary password = '"+ password +"'";
		try {
			con = DatabaseConnection.dbConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			int count = 0;
			while(rs.next()) {
				count +=1;
			}
		
			if(count == 0) {
				System.out.println("Username does not exist, please register as customer...");
			}
			else {
				System.out.println("Succesfully logged in as customer.");
			}
			
			System.out.print("Enter 0 to go to Homepage: ");
			int homePage = sc.nextInt();
			if(homePage == 0) {
				SelectOptionToProceed sotp = new SelectOptionToProceed();
				sotp.options();
			}
			else {
				System.out.println("Enter valid choice.");
			}
		}
		catch(Exception e){
			System.out.println("Please check your Database Connection...");
			e.printStackTrace();
		}
	}
	
	public void viewProducts() {
		
	}
	
	public void searchProduct() {
		
	}
	
	public void addProductToCart() {
		
	}
	
	public void removeProductFromCart() {
		
	}
	
	public void viewCart() {
		
	}
	
	public void proceedToPayment() {
		
	}
	
	public void editProfile() {
		
	}
}
