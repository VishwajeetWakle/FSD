package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {
	
	public static void main(String[] args) { 
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username ="root";
		String password ="7028";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success.....");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
