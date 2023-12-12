package com.jdbc.shopping.console;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Products {
	private static Connection con;
	private static Statement stmt;
	
	int productId,ram,rom;
	String brand,model,processor,androidVersion;
	double price;
	
	Scanner sc = new Scanner(System.in);
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void createProduct() throws SQLException {
		System.out.println("In the methos create products");
		System.out.print("Enter product Id : ");
		setProductId(sc.nextInt());
		System.out.print("Enter brand name : ");
		setBrand(sc.next());
		System.out.print("Enter model name : ");
		setModel(sc.next());
		System.out.print("Enter processor : ");
		setProcessor(sc.next());
		System.out.print("Enter android version : ");
		setAndroidVersion(sc.next());
		System.out.print("Enter Ram : ");
		setRam(sc.nextInt());
		System.out.print("Enter Storage : ");
		setRom(sc.nextInt());
		System.out.print("Enter price : ");
		setPrice(sc.nextDouble());
		
		String productCheck = "select * from products where productId = '"+getProductId()+"'";
		con = DatabaseConnection.dbConnection();
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(productCheck);
		
		int count = 0;
		while (rs.next()) {
			count +=1;
		}
		
		try {
			if(count>0) {
				System.out.println("Product already exists, create a product with different product details");
			}
			else {
				String query = "insert into products values('"+getProductId()+"','"+getBrand()+"','"+getModel()+"',"
						+ "'"+getProcessor()+"','"+getAndroidVersion()+"','"+getRam()+"','"+getRom()+"','"+getPrice()+"')";
				int rs2 = stmt.executeUpdate(query);
				
				if(rs2>0) {
					System.out.println("Product Succesfully added...");
				}
				else {
					System.out.println("Error creating product.");
				}
			}
		}catch(SQLException e) {
			System.out.println("Please check your Database Connection...");
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
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
