package org.institute.controller;

import org.institute.bean.Contact;
import org.institute.bean.ResponseBean;
import org.institute.repository.PhBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/save-contact")
	public ResponseBean save(@RequestBody Contact co) {
		ResponseBean response = new ResponseBean();
		boolean result = bookRepository.save(co);
		if(result) {
			response.setMsg("Contact Saved Succesfully....");
			response.setCode("201");
		}else {
			response.setMsg("Some error... please try again...");
			response.setCode("202");
		}
		return response;
	}
	
	@DeleteMapping("/delete-contact")
	public ResponseBean delete(@Param("id") int id) {
		ResponseBean response = new ResponseBean();
		boolean result = bookRepository.delete(id);
		if(result) {
			response.setMsg("Contact deleted Succesfully....");
			response.setCode("203");
		}else {
			response.setMsg("Some error... please try again...");
			response.setCode("204");
		}
		return response;
	}
	@PutMapping("/update-contact")
	public ResponseBean update(@RequestBody Contact co) {
		ResponseBean response = new ResponseBean();
		boolean result = bookRepository.update(co);
		if(result) {
			response.setMsg("Contact Updated Succesfully....");
			response.setCode("205");
		}else {
			response.setMsg("Some error... please try again...");
			response.setCode("206");
		}
		return response;
	}
}
