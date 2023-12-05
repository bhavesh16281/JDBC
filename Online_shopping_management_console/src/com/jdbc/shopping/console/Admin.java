package com.jdbc.shopping.console;

import java.sql.*;
import java.util.Scanner;

public class Admin extends Shop {
	private static Connection con;
	private static Statement stmt;
	Scanner sc = new Scanner(System.in);
	
	
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
		
		System.out.println("Create a password: ");
		password = sc.next();
		
		String query = "insert into admin values ('"+adminId+"','"+fName+"','"
				+lName+"','"+emailId+"','"+mobileNo+"','"+userName+"','"+password+"')";
		
		try {
			int rs;
			con = DatabaseConnection.dbConnection();
			stmt = con.createStatement();
			rs = stmt.executeUpdate(query);
			if(rs>0) {
				System.out.println("Admin succesfully created...");
				System.out.println("Your user name is: "+ userName);			}
			else {
				System.out.println("Error creating admin...");
			}
		} catch (SQLException e) {
			System.out.println("Please check your Database Connection...");
		}
		finally {
			con.close();
		}
		
		System.out.print("Enter 5 to go to Homepage: ");
		homePage = sc.nextInt();
		if(homePage == 5) {
			SelectOptionToProceed sotp = new SelectOptionToProceed();
			sotp.options();
		}
		else {
			System.out.println("Enter valid choice.");
		}
	}
	
	public void loginAsAdmin() {
		
		String userName,password;
		System.out.println("Method to login as Admin");
		System.out.print("Enter User name: ");
		userName = sc.next();
		System.out.println("Enter Password: ");
		password = sc.next();
		
		String query = "select userName from admin";
		
		try {
			con = DatabaseConnection.dbConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(rs.next());
			
			if(rs.next()) {
				System.out.println("Login succesfull..");
			}
			else {
				System.out.println("Username does not exist...");
			}
		}
		catch(Exception e){
			System.out.println();
		}
	}
	
	public void addProduct() {
		
	}
	
	public void deleteProduct() {
		
	}
	
	public void viewProducts() {
		
	}
	
	public void searchProducts() {
		
	}
	
	public void addingCustomers() {
		
	}
	
	public void removingCustomers() {
		
	}
	
	public void editingCustomers() {
		
	}
	
	public void viewCustomers() {
		
	}

}
