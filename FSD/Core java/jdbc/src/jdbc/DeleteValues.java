package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteValues {

	public static void main(String[] args) {
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
				PreparedStatement ptmt = con.prepareStatement("delete from student where id=?");
				ptmt.setInt(1, 7);
				int result = ptmt.executeUpdate();
				System.out.println(result +" : rows Added");
				con.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
