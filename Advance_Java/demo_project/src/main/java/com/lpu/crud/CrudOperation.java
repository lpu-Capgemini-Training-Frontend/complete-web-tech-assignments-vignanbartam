package com.lpu.crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudOperation {
	private static String url = "jdbc:postgresql://localhost:5432/lpu";
	private static String user = "postgres";
	private static String password = "root";
	private static Connection con;
	static {
		try {
			Class.forName("org.postgresql.Driver");//fully qualified class name
			System.out.println("loaded");
			con =  DriverManager.getConnection(url, user, password);			
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException{
		saveEmployee();
		updateEmployee();
		deleteEmployee();
		fetchEmployee();
		closeConnection();
	}
	public static void saveEmployee() throws SQLException{
		Statement stm = con.createStatement();
		stm.execute("insert into employee values(39, 'Rishi', 5600, 'rishi@gmail.com', 347389290)");
	}
	public static void updateEmployee() throws SQLException{
		Statement stm = con.createStatement();
		stm.execute("update employee set id=3 where id=10");
	}
	public static void deleteEmployee() throws SQLException{
		Statement stm = con.createStatement();
		stm.execute("delete from employee where id=30");
	}
	public static void fetchEmployee() throws SQLException{
		Statement stm = con.createStatement();
		stm.execute("select * from employee");
		ResultSet rs = stm.getResultSet();
		while(rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("sal") + " " + rs.getString("email") + " " + rs.getLong("phone"));
		}
	}
	
	public static void closeConnection() throws SQLException{
		con.close();
	}
}
