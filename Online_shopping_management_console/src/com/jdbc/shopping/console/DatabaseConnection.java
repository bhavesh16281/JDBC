package com.jdbc.shopping.console;

import java.sql.*;

public class DatabaseConnection {
	private static final String url = "jdbc:mysql://localhost:3306/online_shopping_database";
	private static final String userName = "root";
	private static final String password = "root";
	
	static Connection con;
	
	public static Connection dbConnection()throws SQLException{
		try {
			con = DriverManager.getConnection(url,userName,password);
		}
		catch(SQLException e){
			System.out.println("DATABASE IS NOT CONNECTED...");
		}
		return con;
	}
	

}
