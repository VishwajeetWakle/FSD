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
	
}
