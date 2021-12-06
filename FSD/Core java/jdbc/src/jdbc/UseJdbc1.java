package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UseJdbc1 {

	public static void main(String[] args) {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?useSSL=false", "root", "7028");
				System.out.println("Conneton succc.........");
			//	PreparedStatement stmt = con.prepareStatement("insert into guru values(4,'Vishwajeet','Aurangabd')");
			//	PreparedStatement stmt = con.prepareStatement("update guru set name=? where id=?");
			//	stmt.setString(1, "Vishwa");
			//	stmt.setInt(2, 4);
			//	int a= stmt.executeUpdate();
				PreparedStatement stmt = con.prepareStatement("select * from guru");
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt("id")+"\t");
					System.out.print(rs.getString("name")+"\t");
					
					System.out.print(rs.getString("city")+"\n");
								}
				con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
