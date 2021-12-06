package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDynamicValues {

	public static void main(String[] args) {
	
		int id =7;
		String name = "Test";
		String contact = "9898989898";
		String city = "Mumbai";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
			PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, contact);
			stmt.setString(4, city);
			
			int count = stmt.executeUpdate();
			System.out.println(count +" : rows inserted");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
