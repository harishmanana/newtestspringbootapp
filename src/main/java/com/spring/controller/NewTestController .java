package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewTestController {
	@GetMapping("/users")
	public String home() {
		return "This is home";
	}
}
