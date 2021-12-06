package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;
// Create table employee with empid, name, email, password (create in SQL)
// 1. WAP to insert employee into database
// 2. WAP to Accept email and password from the user by scanner and check whether semail and password vald or not.
// If valid then print "Valid User" else print "Invalid User"  massage
public class Task1 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee Id");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name");
			String name = sc.next();
			System.out.println("Enter Employee Email");
			String email = sc.next();
			System.out.println("Enter Employee Password");
			String pass = sc.next();
			sc.close();
		try {
			Properties props = new Properties();
			props.load(new FileInputStream("resources1/DBinfo.properties"));
			String Driver = props.getProperty("Driver");
			String url = props.getProperty("url");
			String username = props.getProperty("username");
			String password = props.getProperty("pass");
			
			Class.forName(Driver);
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stmt = con.prepareStatement("insert into Employee values(?, ?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setString(4, pass);
			
			int result = stmt.executeUpdate();
			System.out.println(result +" : rows Afected");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();		}
	}

}
