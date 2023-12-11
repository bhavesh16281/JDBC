package com.jdbc.shopping.console;

import java.util.Scanner;

public class SelectOptionToProceed {
	
	
	public void mainMenuOptions() {
		Admin admin = new Admin();
		Customer customer = new Customer();
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Select an option to proceed...");
			System.out.println("1 - Register as ADMIN");
			System.out.println("2 - Register as CUSTOMER");
			System.out.println("3 - LOGIN TO SYSTEM");
			System.out.println("4 - EXIT");
			System.out.println("*******************************************");
			System.out.print("Enter Choice: ");
			int option = sc.nextInt();
			if(option == 1) {
				
				admin.registerAsAdmin();
			}
			else if(option ==2) {
				
				customer.regesterAsCustomer();
			}
			else if(option ==3) {
				
				
				System.out.print("ENTER 'A' FOR ADMIN OR 'C' FOR CUSTOMER: ");
				String loginAs = sc.next();
				if(loginAs.equalsIgnoreCase("A")) {
					admin.loginAsAdmin();
				}
				else if(loginAs.equalsIgnoreCase("C")) {
					customer.loginAsCustomer();
				}
				else {
					System.out.println("Enter Valid Input");
				}
			}
			else if(option ==4) {
				System.out.println("Bye Fraaandssss...");
			}
			else {
				System.out.println("SELECT A VALID OPTION..");
			}
			
		}
		catch(Exception e){
			System.out.println("Error in mainMenuOptions method...");
			e.printStackTrace();
		}
		
	}
	
	public void adminMenuOptions() {
		Admin admin = new Admin();
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Select an option to proceed...");
			System.out.println("1 - Add Product");
			System.out.println("2 - Delete Product");
			System.out.println("3 - View Products");
			System.out.println("4 - Search Products");
			System.out.println("5 - Remove Customer");
			System.out.println("6 - Edit Customer");
			System.out.println("7 - View Customers");
			System.out.println("8 - Edit your Profile");
			System.out.println("9 - Logout..");
			System.out.println("*******************************************");
			System.out.print("Enter Choice: ");
			int option = sc.nextInt();
			
			if(option == 1) {
				admin.addProduct();
			}
			else if(option == 2) {
				admin.deleteProduct();
			}
			else if(option == 3) {
				admin.viewProducts();
			}
			else if(option == 4) {
				admin.searchProducts();
			}
			else if(option == 5) {
				admin.removingCustomers();
			}
			else if(option == 6) {
				admin.editingCustomers();
			}
			else if(option == 7) {
				admin.viewCustomers();
			}
			else if(option == 8) {
				admin.editAdminProfile();
			}
			else if(option == 9) {
				System.out.println("Logout succesfull...");
				
				SelectOptionToProceed sotp = new SelectOptionToProceed();
				sotp.mainMenuOptions();
			}
			else {
				System.out.println("SELECT A VALID OPTION..");
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
		catch(Exception e){
			System.out.println("Error in adminMenuOptions method");
			e.printStackTrace();
		}
		
		
	}

}
