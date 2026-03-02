package com.lpu.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindEmployee {
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
			stm.execute("select * from employee");
			ResultSet rs = stm.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("sal"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getLong("phone"));
				
			}
			//5th close connection
			con.close();
		} catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
