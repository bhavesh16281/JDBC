package com.jdbc.shopping.console;

import java.util.Scanner;

public class SelectOptionToProceed {
	
	public void options() {
		
		Admin admin = new Admin();
		Customer customer = new Customer();
		try(Scanner sc = new Scanner(System.in)) {
			
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
			System.out.println("Error in SelectOptionToProceed.java");
		}
		
	}

}
