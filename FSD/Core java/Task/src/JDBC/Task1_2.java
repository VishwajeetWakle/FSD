package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

//Create table employee with empid, name, email, password (create in SQL)
//1. WAP to insert employee into database
//2. WAP to Accept email and password from the user by scanner and check whether semail and password vald or not.
//If valid then print "Valid User" else print "Invalid User"  massage

public class Task1_2 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		//	System.out.println("Enter Email : ");
		//	String userEmail = sc.next();
			System.out.println("Enter Pass");
			String userPass = "Vishwajeet";//sc.next();
			sc.close();
		
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("resources1/DBinfo.properties"));
			String Driver = prop.getProperty("Driver");
			String url = prop.getProperty("url");
			String Pass = prop.getProperty("pass");
			String user = prop.getProperty("username");
			Class.forName(Driver);
			Connection con = DriverManager.getConnection(url, user, Pass);
			PreparedStatement ptmt = con.prepareStatement("select * from Employee ");
			
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("empid")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("email")+"\t");
				System.out.print(rs.getString("password")+"\n");
			}
			while(rs.next()) {
			//	String savedEmail = rs.getString("email");
				String savedPass = rs.getString("password");
				if(savedPass == userPass) {
					System.out.println("Valid User");
				}
				
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
