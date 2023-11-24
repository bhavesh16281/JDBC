package com.jdbc.shopping.console;

import java.util.Scanner;

public class SelectOptionToProceed {
	
	public void options() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Choice: ");
			int option = sc.nextInt();
			if(option == 1) {
				System.out.println("Register as ADMIN");
			}
			else if(option ==2) {
				System.out.println("Register as CUSTOMER");
			}
			else if(option ==3) {
				System.out.println("LOGIN TO SYSTEM");
			}
			else if(option ==4) {
				System.out.println("EXIT");
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
