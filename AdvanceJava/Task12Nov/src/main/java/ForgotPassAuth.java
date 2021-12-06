

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ForgotPassAuth")
public class ForgotPassAuth extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("upass");
		
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
			PreparedStatement stmt = con.prepareStatement("select * from task12nov where name=? and email=?");
			stmt.setString(1, name);
			stmt.setString(2, email);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()){
				HttpSession session = request.getSession();
				session.setAttribute("name", rs.getString("name"));	
				session.setAttribute("email", rs.getString("email"));	
				PreparedStatement ptmt = con.prepareStatement("Update task12nov set password=?  where name=? and email=?");
				ptmt.setString(1, pass);
				ptmt.setString(2, name);
				ptmt.setString(3, email);
				ptmt.executeUpdate();
				response.sendRedirect("Login.jsp?code=122");
			}else{
				response.sendRedirect("ForgotPass.jsp?code=123");
			}
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
