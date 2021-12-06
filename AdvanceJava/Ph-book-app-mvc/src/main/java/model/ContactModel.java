package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Contact;
import util.DbUtil;

public class ContactModel {
	
		public List<Contact> getAll() {
			List<Contact> contactList = new ArrayList<Contact>();
			Connection con = DbUtil.getConnection();
			try {
				PreparedStatement stmt = con.prepareStatement("select * from phbook");
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					Contact c = new Contact();
					c.setId(rs.getInt("id"));
					c.setName(rs.getString("name"));
					c.setContact(rs.getString("contact"));
					c.setDob(rs.getString("dob"));
					contactList.add(c);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return contactList;
		}

		public Contact editById(int id) {
			Contact contact = new Contact();
			Connection con = DbUtil.getConnection();
			try {
				PreparedStatement stmt = con.prepareStatement("select * from phbook where id=?");
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				if(rs.next()) {
					contact.setId(rs.getInt("id"));
					contact.setName(rs.getString("name"));
					contact.setContact(rs.getString("contact"));
					contact.setDob(rs.getString("dob"));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return contact;
		}
		public boolean update(Contact ct) {
			boolean flag = false;
			Connection con = DbUtil.getConnection();
			try {
				 	PreparedStatement stmt = con.prepareStatement("update phbook set name=?, contact=?, dob=? where id=?");
				 	stmt.setString(1, ct.getName());
				 	stmt.setString(2, ct.getContact());
				 	stmt.setString(3, ct.getDob());
				 	stmt.setInt(4, ct.getId());
				 	int count = stmt.executeUpdate();
				 	if(count>0) {
				 		flag = true;
				 	}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DbUtil.closeConnection(con);
			}
			return flag;
		}
		public boolean create(Contact co) {
			boolean flag = false;
			Connection con = DbUtil.getConnection();
			try {
				 	PreparedStatement stmt = con.prepareStatement("insert into phbook values(?,?,?,?)");
				 	stmt.setInt(1, co.getId());
				 	stmt.setString(2, co.getName());
				 	stmt.setString(3, co.getContact());
				 	stmt.setString(4, co.getDob());
				 	int count = stmt.executeUpdate();
				 	if(count>0) {
				 		flag = true;
				 	}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DbUtil.closeConnection(con);
			}
			return flag;
		}
		public boolean delete(int id) {
			boolean flag = false;
			Connection con = DbUtil.getConnection();
			try {
				 	PreparedStatement stmt = con.prepareStatement("delete from phbook where id=?");
				 	stmt.setInt(1, id);
				 	int count = stmt.executeUpdate();
				 	if(count>0) {
				 		flag = true;
				 	}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DbUtil.closeConnection(con);
			}
			return flag;
		}
		public List<Contact> namesearch(String name) {
			List<Contact> contactList = new ArrayList<Contact>();
			System.out.println("This is name model");

			Connection con = DbUtil.getConnection();
			try {
				 	PreparedStatement stmt = con.prepareStatement("select * from phbook where name=?");
				 	ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						Contact c = new Contact();
						c.setId(rs.getInt("id"));
						c.setName(rs.getString("name"));
						c.setContact(rs.getString("contact"));
						c.setDob(rs.getString("dob"));
						contactList.add(c);
					}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DbUtil.closeConnection(con);
			}
			return contactList;
		}
		public List<Contact> contactsearch(String name) {
			List<Contact> contactList = new ArrayList<Contact>();
			System.out.println("This is contact model");

			Connection con = DbUtil.getConnection();
			try {
				 	PreparedStatement stmt = con.prepareStatement("select * from phbook where contact=?");
				 	stmt.setString(1, name);
				 	ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						Contact c = new Contact();
						c.setId(rs.getInt("id"));
						c.setName(rs.getString("name"));
						c.setContact(rs.getString("contact"));
						c.setDob(rs.getString("dob"));
						contactList.add(c);
					}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DbUtil.closeConnection(con);
			}
			return contactList;
		}

		public List<Contact> dobsearch(String name) {
			List<Contact> contactList = new ArrayList<Contact>();
			System.out.println("This is dob model ");

			Connection con = DbUtil.getConnection();
			try {
				 	PreparedStatement stmt = con.prepareStatement("select * from phbook where dob=?");
				 	stmt.setString(1, name);
				 	ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						Contact c = new Contact();
						c.setId(rs.getInt("id"));
						c.setName(rs.getString("name"));
						c.setContact(rs.getString("contact"));
						c.setDob(rs.getString("dob"));
						contactList.add(c);
					}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DbUtil.closeConnection(con);
			}
			return contactList;
		}

}
