package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SelectValues {

	public static void main(String[] args) {
		try {
			Properties props= new Properties();
			props.load(new FileInputStream("resources/DBConfig.properties"));
			String Driver = props.getProperty("Driver");
			String url = props.getProperty("url");
			String username = props.getProperty("username");
			String passworld = props.getProperty("pass");
			
			Class.forName(Driver);
			Connection con = DriverManager.getConnection(url, username, passworld);
			PreparedStatement ptmt = con.prepareStatement("select * from Student where city=?");
			ptmt.setString(1, "Dehradun");
			ResultSet rs = ptmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("contact")+"\t");
				System.out.print(rs.getString("city")+"\n");
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
