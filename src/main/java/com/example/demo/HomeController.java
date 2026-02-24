package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/csehome")
	public String cseHome() {
		return "WELCOME TO CSE 😔😔";
	}
	
	@GetMapping("/myrocks")
	public String rocks() {
		return "HELLO WORLD!!!!!!!! 💙";
	}
}
