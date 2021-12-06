

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Auth")
public class Auth extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		String name = request.getParameter("username");
		String pass = request.getParameter("userpass");
		
		if("admin".equals(name)&&"admin@123".equals(pass)) {
			response.sendRedirect("");
			request.setAttribute("msg", "Hello User, Welcome to home page");
		}
	}

}
