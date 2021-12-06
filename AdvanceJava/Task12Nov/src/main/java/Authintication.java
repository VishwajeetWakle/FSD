

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

@WebServlet("/Authintication")
public class Authintication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false", "root", "7028");
			PreparedStatement stmt = con.prepareStatement("select * from task12nov where name=? and password=?");
			stmt.setString(1, name);
			stmt.setString(2, pass);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()){
				HttpSession session = request.getSession();
				session.setAttribute("name", rs.getString("name"));	
				session.setAttribute("password", rs.getString("password"));	
				response.sendRedirect("Home.jsp");
			}else{
				response.sendRedirect("Login.jsp?code=401");
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
