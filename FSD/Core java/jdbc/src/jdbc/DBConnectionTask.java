package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTask {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
			System.out.println("Connection success......");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
