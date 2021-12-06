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

@WebServlet("/update-contact-details")
public class UpdateContactController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String dob = request.getParameter("dob");
		
		Contact ct = new Contact();
		ct.setId(id);
		ct.setName(name);
		ct.setContact(contact);
		ct.setDob(dob);
		
		ContactModel model = new ContactModel();
		boolean result = model.update(ct);
		if(result) {
			request.setAttribute("code", "200");
		}else {
			request.setAttribute("code", "500");
		}
		request.setAttribute("contact", ct);
		RequestDispatcher dis = request.getRequestDispatcher("editcontact.jsp");
		dis.forward(request, response);
	}

}
