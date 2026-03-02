package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class PreparedStatement1 {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/lpu";
		String user = "postgres";
		String password = "root";
		Scanner sc = new Scanner(System.in);
		try {
			//1st step load Driver
			Class.forName("org.postgresql.Driver");
			//2nd create Connection
			Connection con = DriverManager.getConnection(url, user, password);
			//3rd create statement
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			ps.setDouble(3, sc.nextDouble());
			ps.setString(4, sc.next());
			ps.setLong(5, sc.nextLong());
			//4th execute query
			ps.execute();
			System.out.println("inserted");
			//5th close connection
			con.close();
			sc.close();
		} catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
