package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Contact;
import model.ContactModel;

@WebServlet("/my-contact-list")
public class ViewContactController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the list of contact from model
		ContactModel model = new ContactModel();
		List<Contact> list = model.getAll();
		
		//send list of contact into view (jsp page)
		
		
		request.setAttribute("contactList", list);
		RequestDispatcher dis = request.getRequestDispatcher("viewcontact.jsp");
		dis.forward(request, response);
	}

}
