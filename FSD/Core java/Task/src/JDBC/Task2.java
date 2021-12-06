package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Task2 {

	public static void main(String[] args) {
		try {
			Properties props = new Properties();
			props.load(new FileInputStream("resources1/DBinfo.properties"));
			String Driver = props.getProperty("Driver");
			String url = props.getProperty("url");
			String username = props.getProperty("username");
			String password = props.getProperty("pass");
			
			Class.forName(Driver);
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement stmt = con.prepareStatement("select * from Employee where email=?, Password=?");
		
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
