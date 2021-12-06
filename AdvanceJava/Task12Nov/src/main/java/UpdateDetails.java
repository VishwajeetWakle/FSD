

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateDetails")
public class UpdateDetails extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");

		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
			PreparedStatement stmt = con.prepareStatement("Update task12nov set  name=? where password=?");
				stmt.setString(1, name);
				stmt.setString(2, pass);
				stmt.executeUpdate();
				
				PreparedStatement stmt1 = con.prepareStatement("Update task12nov set  email=? where password=?");
				
				stmt1.setString(1, email);
				stmt1.setString(2, pass);
				stmt1.executeUpdate();
				PreparedStatement stmt2 = con.prepareStatement("Update task12nov set  contact=? where password=?");
				
				
				stmt2.setString(1, contact);
				stmt2.setString(2, pass);
				stmt2.executeUpdate();
				
				con.close();
				response.sendRedirect("Login.jsp?code=125");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
