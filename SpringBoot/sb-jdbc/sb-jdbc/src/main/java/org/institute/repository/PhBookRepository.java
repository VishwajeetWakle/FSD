package org.institute.repository;

import java.util.List;

import org.institute.bean.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PhBookRepository {

	@Autowired
	private JdbcTemplate template;
	
	public List<Contact> getAllContact() {
		
		return template.query("select * from phbook", new BeanPropertyRowMapper<Contact>(Contact.class));
	}
	public boolean save(Contact co) {
		boolean flag = false;
		Object data[] = {co.getName(),co.getContact(),co.getDob()};
		int count = template.update("insert into phbook values(0,?,?,?)", data);
		if(count>0) {
			flag=true;
		}
	
		return flag;
	}
	public boolean delete(int id) {
		boolean flag = false;
		
		int count = template.update("delete from phbook where id=?", id);
		if(count>0) {
			flag=true;
		}
	
		return flag;
	}
	public boolean update(Contact co) {
	boolean flag = false;
		Object data[] = {co.getName(),co.getContact(),co.getDob(),co.getId()};
		int count = template.update("update phbook set name=?, contact=?, dob=? where id=?", data);
		if(count>0) {
			flag=true;
		}
	
		return flag;}
	
}
