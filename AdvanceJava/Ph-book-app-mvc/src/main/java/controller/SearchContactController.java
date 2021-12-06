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

@WebServlet("/search-contact")
public class SearchContactController extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("This is controller");
		
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String dob = request.getParameter("dob");
		
		ContactModel model = new ContactModel();
		if(name!=null) {
			System.out.println("This is name call");

			List<Contact> namelist = model.namesearch(name);

			request.setAttribute("contactList", namelist);
			RequestDispatcher dis = request.getRequestDispatcher("searchcontact.jsp");
			dis.forward(request, response);
		}else if(contact != null) {
			System.out.println("This is contact call");

			List<Contact>  contactlist = model.contactsearch(contact);
			request.setAttribute("contactList", contactlist);
			RequestDispatcher dis = request.getRequestDispatcher("searchcontact.jsp");
			dis.forward(request, response);
		
		}else {
			System.out.println("This is dob call");

			List<Contact> doblist = model.dobsearch(dob);
			request.setAttribute("contactList", doblist);
			RequestDispatcher dis = request.getRequestDispatcher("searchcontact.jsp");
			dis.forward(request, response);
		
		}
	}

}
