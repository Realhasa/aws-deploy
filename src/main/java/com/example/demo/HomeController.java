package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/csehome")
	public String cseHome() {
		return "Welcome to CSE Spring RESTapi";
	}
	
	@GetMapping("/myrocks")
	public String rocks() {
		return "Welcome to 3rd year DevOps world";
	}
}
