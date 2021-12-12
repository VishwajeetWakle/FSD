package org.institute.controller;

import java.util.List;

import org.institute.entity.EmployeeInfo;
import org.institute.repository.EmpInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmpInfoRepo empInfoRepo;
	
	@PostMapping("/create-emp")
	public String saveEmployee(@RequestBody EmployeeInfo emp) {
		empInfoRepo.save(emp);
		return "Employee Save Succesfully......";
	}
	
	@GetMapping("/get-emp")
	public List<EmployeeInfo> getAll(){
		return empInfoRepo.findAll();
	}
}
