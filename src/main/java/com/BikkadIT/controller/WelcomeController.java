package com.BikkadIT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = "Welcome To java Class";
		return msg;

	}
}
