package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/csehome")
	public String cseHome() {
		return "😔😔 বাড়া** চুলকাচুলকি বাদ দিয়ে পড়তে বসেন and this is my first spring aws spring project";
	}
	
	@GetMapping("/myrocks")
	public String rocks() {
		return "HELLO WORLD!!!!!!!! 💙  and welcome to my jenkins project,, this is real";
	}
}
