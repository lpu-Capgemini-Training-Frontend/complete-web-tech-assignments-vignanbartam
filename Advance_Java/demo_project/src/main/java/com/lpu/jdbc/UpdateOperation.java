package com.lpu.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateOperation {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/lpu";
		String user = "postgres";
		String password = "root";
		try {
			//1st step load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("loaded");
			//2nd create Connection
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			//3rd create statement
			Statement stm = con.createStatement();
			//4th execute query
			stm.execute("UPDATE student SET phone=6303939024 WHERE id=10");
			//5th close connection
			con.close();
		} catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
