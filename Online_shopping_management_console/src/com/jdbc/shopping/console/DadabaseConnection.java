package com.jdbc.shopping.console;

import java.sql.*;

class DadabaseConnection {
	private final String url = "jdbc:mysql://localhost:3306/sakila";
	
	public void dbConnection() throws Exception {
		Connection con = DriverManager.getConnection(url, "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from actor");
		
		while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("actor_id"));
//            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First Name: " + rs.getString("first_name"));
            System.out.println(", Last Name: " + rs.getString("last_name"));
            System.out.println();
         }
		con.close();
	}
	

}
