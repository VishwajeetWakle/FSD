package org.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/")
public class AdminController {

	@GetMapping("/dashboard")
	public String dashboard() {
		return "This is admin dashboard";
	}
	
	@GetMapping("/manage-staff")
	public String staffDetails() {
		return "Endpont to manage staff details";
	}
}
