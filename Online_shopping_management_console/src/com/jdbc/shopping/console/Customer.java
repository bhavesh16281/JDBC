package com.jdbc.shopping.console;

import java.sql.Connection;
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
		
		String query = "insert into customer values ('"+custId+"','"+custFName+"','"
				+custLName+"','"+custEmailId+"','"+mobileNo+"','"+userName+"','"+custPassword+"')";
		
		try {
			int rs;
			con = DatabaseConnection.dbConnection();
			stmt = con.createStatement();
			rs = stmt.executeUpdate(query);
			if(rs>0) {
				System.out.println("Customer succesfully created...");
				System.out.println("Your user name is: "+ userName);			}
			else {
				System.out.println("Error creating customer...");
			}
		} catch (SQLException e) {
			System.out.println("Please check your Database Connection...");
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
	}
	
}
