package org.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	public WelcomeController() {
		System.out.println("In Welcome Controller");
	}
	
	@GetMapping("/welcome")
	public String welcomeString() {
		System.out.println("I an mi welcome url............");
		return "Hello, This is my first url of SB rest end point";
	}
}
