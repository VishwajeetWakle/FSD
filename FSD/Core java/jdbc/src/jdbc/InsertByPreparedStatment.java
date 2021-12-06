package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertByPreparedStatment {

	public static void main(String[] args) {
		
		try {
			// Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
			// Create Statement
			PreparedStatement stmt = con.prepareStatement("insert into student values(3, 'XYZ', '7878787878', 'Delhi')");
			// Execute Query
			int count = stmt.executeUpdate();
			System.out.println(count + " : rows insterted");
			// close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
