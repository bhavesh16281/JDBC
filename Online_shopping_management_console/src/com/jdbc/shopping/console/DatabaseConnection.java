package com.jdbc.shopping.console;

import java.sql.*;

public class DatabaseConnection {
	private final String url = "jdbc:mysql://localhost:3306/sakila";
	private final String userName = "root";
	private final String password = "root";
	
	Connection con;
	
	public void dbConnection()throws SQLException{
		try {
			con = DriverManager.getConnection(url,userName,password);
//			Statement stmt = con.createStatement();
			System.out.println("SUCCESFULLY CONNECTED TO DADABASE...");
			
		}
		catch(SQLException e){
			System.out.println("DATABASE IS NOT CONNECTED...");
		}
		finally {
			con.close();
		}
		
//		while(rs.next()){
//            //Display values
//            System.out.print("ID: " + rs.getInt("actor_id"));
////            System.out.print(", Age: " + rs.getInt("age"));
//            System.out.print(", First Name: " + rs.getString("first_name"));
//            System.out.println(", Last Name: " + rs.getString("last_name"));
//            System.out.println();
//         }
//		con.close();
	}
	

}
