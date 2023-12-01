package com.jdbc.shopping.console;

import java.util.Scanner;

public class Admin extends Shop {
	Scanner sc = new Scanner(System.in);
	public void registerAsAdmin() {
		
		System.out.println("Method to register as admin");
		
		String fName,lName,password,emailId;
		Double mobileNo;
		System.out.print("Enter first name: ");
		fName = sc.next();
		System.out.print("Enter last name: ");
		lName = sc.next();
		System.out.print("Enter Email ID: ");
		emailId = sc.next();
		System.out.print("Enter Mobile Number : ");
		mobileNo = sc.nextDouble();
		System.out.println("Create a password: ");
		password = sc.next();
	}
	
	public void loginAsAdmin() {
		System.out.println("Method to login as Admin");
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
