import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FristServlet")
public class FristServlet extends HttpServlet {
		@Override
		protected void service(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
			System.out.println("This is service method from First Servlet");
		}
}
