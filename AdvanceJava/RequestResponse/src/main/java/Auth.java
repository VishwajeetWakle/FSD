

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Auth")
public class Auth extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("uname");
		String Password = request.getParameter("upass");
		if("admin".equals(username)&&"admin@123".equals(Password)){
			out.print("<h1 style='color:green'>Valid User</h1>");
		}else {
			out.print("<h1 style='color:red'>Invalid User</h1>");
		}
		
	}

}
