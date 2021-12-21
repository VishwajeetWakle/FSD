package org.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff/")
public class StaffController {

	@GetMapping("/dashboard")
	public String dashboard() {
		return "This is staff dashboard";
	}
	
	@GetMapping("/my-profile")
	public String staffDetails() {
		return "Endpont to manage my profile";
	}
}
