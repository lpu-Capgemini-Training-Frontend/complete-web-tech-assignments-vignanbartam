
//use preparedstatement and scanner input from user
//save()
//update()
//delete()
//findall()
//find() by id

package com.lpu.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.*;

public class EmployeeUserInput {
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
		save();
		update();
		delete();
		findall();
		find();
		close();
	}
	public static void save() throws SQLException{
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?)");
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		ps.setDouble(3, sc.nextDouble());
		ps.setString(4, sc.next());
		ps.setLong(5, sc.nextLong());
		//4th execute query
		ps.execute();
		System.out.println("inserted");
		sc.close();
	}
	public static void update() throws SQLException{
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = con.prepareStatement("update employee set sal=? where id=?");
		ps.setDouble(1, sc.nextDouble());
		ps.setInt(2, sc.nextInt());
		ps.execute();
		System.out.println("updated");
		sc.close();
	}
	public static void delete() throws SQLException{
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
		ps.setInt(1, sc.nextInt());
		ps.execute();
		System.out.println("deleted");
		sc.close();
	}
	public static void findall() throws SQLException{
		PreparedStatement ps = con.prepareStatement("select * from employee");
		ps.execute();
		ResultSet rs = ps.getResultSet();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+ " " + rs.getString("name") + " " + rs.getInt("sal") + " " + rs.getString("email") + " " + rs.getLong("phone"));
		}
	}
	public static void find() throws SQLException{
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
		ps.setInt(1, sc.nextInt());
		ps.execute();
		ResultSet rs = ps.getResultSet();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+ " " + rs.getString("name") + " " + rs.getInt("sal") + " " + rs.getString("email") + " " + rs.getLong("phone"));
		}
		sc.close();
	}
	public static void close() throws SQLException{
		con.close();
	}
}
