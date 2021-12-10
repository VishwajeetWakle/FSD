package org.institute.controller;

import org.institute.bean.ResponseBean;
import org.institute.repository.PhBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhBookController {

	@Autowired
	private PhBookRepository bookRepository;
	
	@GetMapping("/get-all-contact")
	public ResponseBean getAll() {
		ResponseBean response = new ResponseBean();
		response.setMsg("List of contact");
		response.setCode("200");
		response.setData(bookRepository.getAllContact());
		return response;
	}
}
