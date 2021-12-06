package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Contact;
import model.ContactModel;

@WebServlet("/edit-contact")
public class EditContactController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			int id = Integer.parseInt(request.getParameter("id"));
			
			ContactModel model = new ContactModel();
			Contact contact = model.editById(id);
			
			request.setAttribute("contact", contact);
			RequestDispatcher dis = request.getRequestDispatcher("editcontact.jsp");
			dis.forward(request, response);
	}

}
