package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContactModel;

@WebServlet("/delete-contact")
public class DeleteContactController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			int id = Integer.parseInt(request.getParameter("id"));
			ContactModel model = new ContactModel();
			boolean result = model.delete(id);
			if(result) {
				request.setAttribute("code", "150");
			}else {
				request.setAttribute("code", "160");
			}
			request.setAttribute("contact", id);
			RequestDispatcher dis = request.getRequestDispatcher("my-contact-list");
			dis.forward(request, response);

	}

}
