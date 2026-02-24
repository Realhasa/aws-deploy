package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/csehome")
	public String cseHome() {
		return "বাড়া** চুলকাচুলকি বাদ দিয়ে পড়তে বসেন 😔😔";
	}
	
	@GetMapping("/myrocks")
	public String rocks() {
		return "তোর মতন মানুষরা থাকলেই তো জীবনটা সুন্দর হয়ে যায় ভাই 💙";
	}
}
