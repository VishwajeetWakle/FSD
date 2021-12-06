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


@WebServlet("/create-contact")
public class CreateContactController extends HttpServlet {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int id =0;
				String name = request.getParameter("name");
				String contact = request.getParameter("contact");
				String dob = request.getParameter("dob");
				

				Contact co = new Contact();
				co.setId(id);
				co.setName(name);
				co.setContact(contact);
				co.setDob(dob);
				
				ContactModel model = new ContactModel();
				boolean result = model.create(co);
				if(result) {
					request.setAttribute("code", "110");
				}else {
					request.setAttribute("code", "120");
				}
				request.setAttribute("contact", co);
				RequestDispatcher dis = request.getRequestDispatcher("newcontact.jsp");
				dis.forward(request, response);

			
		}
}
