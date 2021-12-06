package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateValues {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
			PreparedStatement ptmt = con.prepareStatement("update student set contact=? where id=?");
			ptmt.setString(1, "9087654321");
			ptmt.setInt(2, 1);
			int result = ptmt.executeUpdate();
			System.out.println(result +" : rows Added.............");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
